package mgy.entity;

import zj.Column;

import java.io.Serializable;

public class User implements Serializable {
    @Column("eid")
    private int id;
    @Column("ename")
    private String name;
    @Column("epassword")
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
