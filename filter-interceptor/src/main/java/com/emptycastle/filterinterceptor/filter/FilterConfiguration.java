package com.emptycastle.filterinterceptor.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class FilterConfiguration implements WebMvcConfigurer {

    @Bean
    public FilterRegistrationBean<CORSFilter> getCORSFilterRegistrationBean() {
        FilterRegistrationBean<CORSFilter> registrationBean = new FilterRegistrationBean<>(new CORSFilter());
        registrationBean.setOrder(1);
        registrationBean.setUrlPatterns(List.of("/auth/*"));
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean<LoginCheckFilter> getLoginCheckFilterRegistrationBean() {
        FilterRegistrationBean<LoginCheckFilter> registrationBean = new FilterRegistrationBean<>(new LoginCheckFilter());
        registrationBean.setOrder(2);
        registrationBean.setUrlPatterns(List.of("/auth/*"));
        return registrationBean;
    }
}
