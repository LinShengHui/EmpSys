package mgy.controller;

import mgy.dto.ValueDto;

public class ParentDto {

    private ValueDto vd = new ValueDto();
    protected <T> ValueDto success(T t){
        vd.setObj(t);
        return vd;
    }
    protected ValueDto error(int code,String message){
        vd.setCode(code);
        vd.setMessage(message);
        return vd;
    }
}
