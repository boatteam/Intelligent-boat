package edu.zust.boatserver.res;

/**
 * Created by HASEE on 2019/9/14
 */
public class JsonRes {
    public static final String SUCCESS_CODE = "200";
    public static final String BAD_REQUEST_CODE = "400";
    public static final String ERROR_CODE = "500";

    private String code;
    private String msg;
    private static final JsonRes success = new JsonRes(SUCCESS_CODE, "success");
    private static final JsonRes failure = new JsonRes(BAD_REQUEST_CODE, "failure");

    public JsonRes() {
    }

    public JsonRes(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static JsonRes success() {
        return success;
    }

    public static JsonRes failure() {
        return failure;
    }

}
