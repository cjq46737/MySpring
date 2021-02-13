/*
 * @projectName myspring
 * @package com.cjq.spring.springmvc
 * @className com.cjq.spring.springmvc.MyDataContextListener
 * @copyright Copyright 2021 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.springmvc;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * MyDataContextListener
 * @description TODO
 * @author chenjunqi
 * @date 2021年02月13日 9:57 上午
 * @version 3.0.0
 */
public class MyDataContextListener implements ServletContextListener {

    private ServletContext servletContext;

    public MyDataContextListener() {
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        this.servletContext = sce.getServletContext();
        this.servletContext.setAttribute("myData", "this is my Data");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        this.servletContext = null;
    }
}
