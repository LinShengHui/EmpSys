package mgy.dto;

public class ValueDto {
    /**
     * 错误码
     */
    private int code;
    /**
     * 错误信息
     */
    private String message;
    /**
     * 传输数据
     */
    private Object obj;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
