package com.pbl.backend.entity;

/**
 * @author: 杜东方
 * @date: 2020/5/17
 * @description: 用户角色
 */
public class Role {

    private String id;
    private String name;
    private String nameZh;

    public Role(String roleName){
        this.name = roleName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }
}
