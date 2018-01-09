package mgy.entity;

import zj.Column;

/**
 * Created by Administrator on 2018/1/8.
 */
public class Dept {
    @Column("dno")
    private int dno;
    @Column("dname")
    private String dname;

    public Dept() {
    }

    public Dept(int dno, String dname) {
        this.dno = dno;
        this.dname = dname;
    }

    public int getDno() {
        return dno;
    }

    public void setDno(int dno) {
        this.dno = dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
}
