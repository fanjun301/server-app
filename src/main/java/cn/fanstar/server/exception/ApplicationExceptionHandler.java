package cn.fanstar.server.exception;

import cn.fanstar.server.common.ResponseCode;
import cn.fanstar.server.common.ResponseGSon;
import com.google.gson.Gson;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ApplicationExceptionHandler implements HandlerExceptionResolver {
    private static Logger logger = Logger.getLogger(ApplicationExceptionHandler.class);
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        logger.error(ex.getCause());
        ResponseGSon responseGSon = new ResponseGSon();
        if (ex instanceof ApplicationException){
            ApplicationException applicationException = (ApplicationException)ex;
            responseGSon = ResponseGSon.buildResponseResult(applicationException.getResponseCode(), ex.getMessage());
        }else{
            responseGSon = ResponseGSon.buildResponseResult(ResponseCode.FAILED, ex.getCause());
        }
        response.setContentType("application/json");
        writer(response, new Gson().toJson(responseGSon));
        return null;
    }

    private synchronized static void writer(HttpServletResponse response, String str) {
        try {
            response.setHeader("Pragma", "No-cache");
            response.setHeader("Cache-Control", "no-cache");
            response.setCharacterEncoding("UTF-8");
            PrintWriter out = null;
            out = response.getWriter();
            out.print(str);
            out.flush();
            out.close();
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
    }
}
