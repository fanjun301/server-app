package cn.fanstar.server.exception;


import cn.fanstar.server.common.ResponseCode;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ApplicationException extends RuntimeException {

    private ResponseCode responseCode;

    public ApplicationException() {

    }

    public ApplicationException(ResponseCode responseCode) {
        this.responseCode = responseCode;
    }

    public ResponseCode getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(ResponseCode responseCode) {
        this.responseCode = responseCode;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
