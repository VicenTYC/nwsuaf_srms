package cn.nwsuaf.edu.srms.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/22
 * Time: 16:15
 */
public class CorsInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception{

        System.out.println("from: "+httpServletRequest.getRemoteHost());
        System.out.println("request: "+httpServletRequest.getRequestURI());

        String origin = httpServletRequest.getHeader("Origin");
        System.out.println("this is origin: "+origin);

        httpServletResponse.setHeader("Access-Control-Allow-Origin", origin);
        httpServletResponse.setHeader("Access-Control-Allow-Methods", "*");
        httpServletResponse.setHeader("Access-Control-Allow-Headers","Origin,Content-Type,Accept,token,X-Requested-With");
        httpServletResponse.setHeader("Access-Control-Allow-Credentials", "true");

        return true;
    }
}
