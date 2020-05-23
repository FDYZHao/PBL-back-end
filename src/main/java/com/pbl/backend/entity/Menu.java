package com.pbl.backend.entity;

import java.util.List;

/**
 * @author: 杜东方
 * @date: 2020/5/17
 * @description: 角色请求权限路径
 */
public class Menu {

    private String id;
    private String pattern;
    //当前路径需要具备的角色
    private List<Role> roles;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
