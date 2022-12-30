//package com.example.musicDemo.filter;
//
//import javax.servlet.*;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//public class CommonFilter implements Filter {
//    public void destroy() {
//    }
//
//    public void doFilter(ServletRequest request, ServletResponse response,FilterChain chain) throws IOException, ServletException {
//        HttpServletRequest req = (HttpServletRequest) request;
//        String username = (String) req.getSession(true).getAttribute("username");
//        if (username == null) {
//            ((HttpServletResponse) response).sendRedirect(req.getContextPath() + "/jsp/login.jsp");
//            return;
//        } else {
//            chain.doFilter(request, response);
//        }
//    }
//
//    public void init(FilterConfig config) {
//    }
//}
