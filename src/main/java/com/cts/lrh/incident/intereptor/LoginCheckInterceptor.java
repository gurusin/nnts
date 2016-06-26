package com.cts.lrh.incident.intereptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by sudarshana on 2/15/2016.
 */
@Component
public class LoginCheckInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                             Object o) throws Exception {

        final String urlString = httpServletRequest.getRequestURI();
        final HttpSession session = httpServletRequest.getSession();
        if (urlString.endsWith("login")  || urlString.endsWith("doLogin")
                || session.getAttribute("Logged") != null
                || urlString.equals("/incident/")
                || urlString.equals("/")) {
            return true;
        }
        httpServletResponse.sendRedirect("api/login");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
