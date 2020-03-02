package com.sereyna.util.Interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 拦截器
 * 拦截未登录用户
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
    {
        // 在Controller方法处理之前执行拦截 若返回的是false则中断执行 反之亦然

        // 判断当前的User是否为空 若不为空则不拦截
        if (request.getSession().getAttribute("USERINFO")!=null)
            return true;
        // 进行拦截 返回登录界面
        response.sendRedirect(request.getContextPath()+"/");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception
    {
        // 在处理过程中（Controller方法处理完之后  DispatcherServlet进行视图的渲染之前）执行拦截
    }
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception
    {
        // 在DispatcherServlet进行视图的渲染后 返回前进行拦截
    }


}
