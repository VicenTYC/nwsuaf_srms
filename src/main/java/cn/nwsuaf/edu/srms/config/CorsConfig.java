package cn.nwsuaf.edu.srms.config;

import cn.nwsuaf.edu.srms.interceptor.CorsInterceptor;
import cn.nwsuaf.edu.srms.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/22
 * Time: 16:14
 */
@Configuration
public class CorsConfig extends WebMvcConfigurationSupport {

    /**
     * 添加拦截器
     * @param registry
     */

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(new CorsInterceptor()).addPathPatterns("/**");
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**");
    }

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

}
