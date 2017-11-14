package com.vipjoy.joy.api.resp;

/**
 * Created by zhaoyue on 17/6/21.
 */
public class Response<T> {

    private Integer code;

    private String msg;

    private T data;

    public Response() {
    }

    public Response(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <V> Response success(V data) {
        return new Response(ResponseCode.OK.getCode(), ResponseCode.OK.getMsg(), data);
    }

    public static Response success() {
        return success(null);
    }

    public static <V> Response fail(V data) {
        return new Response(ResponseCode.SYSTEM_FAIL.getCode(), ResponseCode.SYSTEM_FAIL.getMsg(), data);
    }

    public static Response fail() {
        return fail(null);
    }

    public static Response fail(int code, String msg) {
        return new Response(code, msg);
    }

    public Response(int code, String msg) {
        this(code, msg, null);
    }

    public Response(int code) {
        this(code, "success");
    }

    public Response(T data) {
        this(200, "success", data);
    }

    public Response(ResponseCode responseCode) {
        this(responseCode, null);
    }

    public Response(ResponseCode responseCode, T data) {
        this(responseCode.getCode(), responseCode.getMsg(), data);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
