package com.pbl.backend.filter;

import com.pbl.backend.entity.Audience;
import com.pbl.backend.utils.JwtTokenUtil;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.MalformedJwtException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Logger;

/**
 * @author: 杜东方
 * @date: 2020/5/17
 * @description: 用户权限管理
 * 过滤器处理所有HTTP请求，并检查是否存在
 * 带有正确令牌的Authorization标头。例如，如果令牌未过期或签名密钥正确。
 */
@Slf4j
public class JWTAuthorizationFilter extends BasicAuthenticationFilter {

    private static final Logger logger = Logger.getLogger(JWTAuthorizationFilter.class.getName());

    private Audience audience;

    public JWTAuthorizationFilter(AuthenticationManager authenticationManager, Audience audience) {
        super(authenticationManager);
        this.audience = audience;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        // 获取请求头信息authorization信息
        final String tokenHeader = request.getHeader(JwtTokenUtil.AUTH_HEADER_KEY);

        // 如果请求头中没有Authorization信息则直接放行了
        if(StringUtils.isBlank(tokenHeader) || !tokenHeader.startsWith(JwtTokenUtil.TOKEN_PREFIX)){
            chain.doFilter(request, response);
            return;
        }

        // 如果请求头中有token，则进行解析，并且设置认证信息
        SecurityContextHolder.getContext().setAuthentication(getAuthentication(tokenHeader));
        super.doFilterInternal(request, response, chain);
    }

    private UsernamePasswordAuthenticationToken getAuthentication(String tokenHeader) {
        String token = tokenHeader.replace(JwtTokenUtil.TOKEN_PREFIX, "");

        try{
            String username = JwtTokenUtil.getUsername(token, audience.getBase64Secret());

            String role = JwtTokenUtil.getUserRole(token, audience.getBase64Secret());
            if(!StringUtils.isEmpty(username)){
                return new UsernamePasswordAuthenticationToken(username, null, Collections.singleton(new SimpleGrantedAuthority(role)));
            }
        }
        catch ( ExpiredJwtException | MalformedJwtException | IllegalArgumentException exception) {
            logger.warning("Request to parse JWT with invalid signature . Detail : " + exception.getMessage());
        }
        return null;
    }
}
