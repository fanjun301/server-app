package cn.fanstar.server.common;

public enum ResponseCode {

    SUCCEEDED("000", "OK"),
    //TODO extend for business scenario
    FAILED("999","FAILED");

    private String code;
    private String value;

    ResponseCode(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }
}
