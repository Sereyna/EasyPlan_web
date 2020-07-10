package com.sereyna.util.Filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException
    {
        // 过滤器初始化
    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException
    {
        // ServletRequest是一个接口 而HttpServletRequest是接口的实现
        // 但有些方法是HttpServletRequest独有的 例如getSession()
        // HttpServletRequest接口继承自ServletRequest接口 增加了和Http相关的方法
        // 但是我们可以强制转换

        //HttpServletRequest request=(HttpServletRequest)servletRequest;
        //HttpServletResponse response=(HttpServletResponse)servletResponse;

        // 若用户没有登录
        /*
        if (request.getSession().getAttribute("USERINFO")==null && request.getRequestURI().indexOf("/user/doLogin.do")==-1)
        {
            response.sendRedirect(request.getContextPath()+"/user/doLogin.do");
        }
        */
        // 若用户已经登录 则继续下一个请求(继续访问)
        //filterChain.doFilter(request,response);
    }

    @Override
    public void destroy()
    {
        // 过滤器销毁
    }
}
