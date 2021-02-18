/*
 * @projectName myspring
 * @package com.cjq.spring.springmvc.lastModitifed
 * @className com.cjq.spring.springmvc.lastModitifed.MyLastModitifiedController
 * @copyright Copyright 2021 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.springmvc.lastModitifed;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.LastModified;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * MyLastModitifiedController
 * @description TODO
 * @author chenjunqi
 * @date 2021年02月18日 10:33 上午
 * @version 3.0.0
 */
public class MyLastModitifiedController extends AbstractController implements LastModified {

    private long lastModitifed;

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.getWriter().write("<a href=''>this</a>");
        return null;
    }

    @Override
    public long getLastModified(HttpServletRequest request) {
        if (lastModitifed == 0L) {
            lastModitifed = System.currentTimeMillis();
        }
        return lastModitifed;
    }
}
