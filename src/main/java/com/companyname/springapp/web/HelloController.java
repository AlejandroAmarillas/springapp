package com.companyname.springapp.web;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController{

    System.out.println("punto de control 0");
    protected final Log logger = LogFactory.getLog(getClass());
    System.out.println("punto de control 1");
    @RequestMapping(value="/hello.htm")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
        String now = (new Date()).toString();
        logger.info("Returning hello view with " + now);

        System.out.println("punto de control 3  "+ now);
        return new ModelAndView("WEB-INF/views/hello.jsp", "now", now);

    }
}
