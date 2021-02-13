/*
 * @projectName myspring
 * @package com.cjq.spring.springmvc.servlet
 * @className com.cjq.spring.springmvc.servlet.MyServlet
 * @copyright Copyright 2021 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.springmvc.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * MyServlet
 * @description TODO
 * @author chenjunqi
 * @date 2021年02月13日 8:06 下午
 * @version 3.0.0
 */
public class MyServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("this is init method!!");
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        handlerLogic(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        handlerLogic(req, resp);
    }

    private void handlerLogic(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("handle myLogic");
        ServletContext servletContext = getServletContext();
        RequestDispatcher rd = servletContext.getRequestDispatcher("index.jsp");
        try {
            rd.forward(req, resp);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
}
