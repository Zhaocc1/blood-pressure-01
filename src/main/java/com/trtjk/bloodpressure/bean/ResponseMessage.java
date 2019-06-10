package com.trtjk.bloodpressure.bean;

public class ResponseMessage {

    private int code;

    private String status;

    private String msg;

    private String data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ResponseMessage(int code, String status, String msg, String data) {
        this.code = code;
        this.status = status;
        this.msg = msg;
        this.data = data;
    }
}
