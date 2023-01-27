package net.xdclass.project.handler;

import net.xdclass.project.utils.JsonData;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler(value=Exception.class)
    Object handlerException(Exception e, HttpServletRequest request){
        return JsonData.buildFailed(-2, "服务端异常");
    }
}
