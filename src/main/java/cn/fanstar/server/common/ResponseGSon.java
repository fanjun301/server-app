package cn.fanstar.server.common;

public class ResponseGSon {
    private String resultCode;
    private String resultMessage;
    private Object content;

    public ResponseGSon() {


    }

    public ResponseGSon(String resultCode, String resultMessage, Object content) {
        this.resultCode = resultCode;
        this.resultMessage = resultMessage;
        this.content = content;
    }

    public static ResponseGSon buildSuccessResult(Object object){
        ResponseGSon result = new ResponseGSon();
        result.setResultCode(ResponseCode.SUCCEEDED.getCode());
        result.setResultMessage(ResponseCode.SUCCEEDED.getValue());
        result.setContent(object);
        return result;
    }

    public static ResponseGSon buildResponseResult(ResponseCode responseCode, Object object){
        ResponseGSon result = new ResponseGSon();
        result.setResultCode(responseCode.getCode());
        result.setResultMessage(responseCode.getValue());
        result.setContent(object);
        return result;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}
