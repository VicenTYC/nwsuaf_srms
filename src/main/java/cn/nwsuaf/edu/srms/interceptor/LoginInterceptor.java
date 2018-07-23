package cn.nwsuaf.edu.srms.interceptor;

import cn.nwsuaf.edu.srms.annotation.LoginRequired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Method;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/22
 * Time: 17:34
 */
public class LoginInterceptor implements HandlerInterceptor{
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if (!(handler instanceof HandlerMethod)) {
            return true;
        }

        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();

        LoginRequired loginRequired = method.getAnnotation(LoginRequired.class);

        if(loginRequired != null) {
            HttpSession session = request.getSession();
            String managerId = (String)session.getAttribute("currentUser");

            if(managerId == null){
                throw new RuntimeException("用户未登录");
            }

            return true;
        }

        return true;

    }
}
