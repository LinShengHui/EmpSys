package mgy.entity;

import zj.Column;

/**
 * Created by Administrator on 2018/1/8.
 */
public class Emp {

    @Column("eno")
    private int eno;
    @Column("ename")
    private String ename;
    @Column("esex")
    private String esex;

    @Column("eage")
    private int eage;
    @Column("ephone")
    private String ephone;
    @Column("edno")
    private int edno;

    public Emp() {
    }

    public Emp(int eno, String ename, String esex, int eage, String ephone, int edno) {
        this.eno = eno;
        this.ename = ename;
        this.esex = esex;
        this.eage = eage;
        this.ephone = ephone;
        this.edno = edno;
    }

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEsex() {
        return esex;
    }

    public void setEsex(String esex) {
        this.esex = esex;
    }

    public int getEage() {
        return eage;
    }

    public void setEage(int eage) {
        this.eage = eage;
    }

    public String getEphone() {
        return ephone;
    }

    public void setEphone(String ephone) {
        this.ephone = ephone;
    }

    public int getEdno() {
        return edno;
    }

    public void setEdno(int edno) {
        this.edno = edno;
    }
}
