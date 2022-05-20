package com.choi.music.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @PackageName: com.choi.music.config
 * @Description: 解决跨域问题
 * @Author: Envy 461712835@qq.com
 * @Date: 2021/11/30 21:34
 */

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")  //允许哪些来源可以访问
                .allowedMethods("*")   //允许哪些方式可以访问
                .allowCredentials(true);   //是否需要进行验证
    }
}
