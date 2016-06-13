package cn.fanstar.server.exception;


import cn.fanstar.server.common.ResponseCode;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ApplicationException extends RuntimeException {

    private ResponseCode responseCode;

    private Object exceptionGson;

    public ApplicationException() {

    }

    public ApplicationException(ResponseCode responseCode) {
        this.responseCode = responseCode;
    }

    public ApplicationException(ResponseCode responseCode, Object exceptionGson) {
        this.responseCode = responseCode;
        this.exceptionGson = exceptionGson;
    }

    public ResponseCode getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(ResponseCode responseCode) {
        this.responseCode = responseCode;
    }

    public Object getExceptionGson() {
        return exceptionGson;
    }

    public void setExceptionGson(Object exceptionGson) {
        this.exceptionGson = exceptionGson;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
