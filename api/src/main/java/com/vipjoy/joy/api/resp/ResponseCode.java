package com.vipjoy.joy.api.resp;

/**
 * 1001 -- 1999 本系统异常
 * 2001 -- 2999 其他系统异常
 * Created by zhaoyue on 2017/6/21.
 */
public enum ResponseCode {
    PARAM_FAIL(1001, "参数异常"),
    PARAM_NOT_FOND(400, "没有找到"),
    OK(200, "操作成功"),
    SYSTEM_FAIL(1002, "系统异常"),
    CLASSROOM_SYSTEM_FAIL(1003, "在线教室系统异常"),
    HELP_NOT_SOLVED(1004, "尚未解决"),
    TRANS_Exceeded(1005, "转移超出次数限制"),
    Scalper_Fail(1006, "约课服务异常"),
    SYNC_FAIL(1007, "同步异常"),
    CLASS_STATUS_NOT_PROBLEM(1008,"教室状态没有问题"),
    TASK_CLOSED(1009,"任务已关闭"),
    CLASS_CLOSED(1010,"教室已关闭");

    ResponseCode(int code,String msg) {
        this.code = code;
        this.msg = msg;
    }

    private int code;
    private String msg;

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getMsg(String msg) {
        return this.msg = msg;
    }
}
