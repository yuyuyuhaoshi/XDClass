package net.xdclass.demoproject.utils;

public class JsonData {
    private int code;
    private String message;
    private Object data;

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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public JsonData(int code, String message, Object data) {
        this.data = data;
        this.message = message;
        this.code = code;
    }

    public JsonData(int code, Object data) {
        this.data = data;
        this.code = code;
    }

    public JsonData(int code, String message) {
        this.message = message;
        this.code = code;
    }

    public static JsonData buildSuccess(Object data) {
        return new JsonData(0, "", data);
    }

    public static JsonData buildFailed(int code, String message) {
        return new JsonData(code, message);
    }
}
