/*
 * @projectName myspring
 * @package com.cjq.spring.springmvc.exceptionHandler
 * @className com.cjq.spring.springmvc.exceptionHandler.MyExceptionHandler
 * @copyright Copyright 2021 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.springmvc.exceptionHandler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * MyExceptionHandler
 * @description TODO
 * @author chenjunqi
 * @date 2021年02月14日 5:50 下午
 * @version 3.0.0
 */
@Component
@Slf4j
public class MyExceptionHandler implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        request.setAttribute("exception", ex.getMessage());
        // 日志记录
        //        log.error("");
        return new ModelAndView("erroe/exception");
    }
}
