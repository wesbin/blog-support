package com.emptycastle.filterinterceptoraop.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class FilterConfiguration implements WebMvcConfigurer {

    @Bean
    public FilterRegistrationBean<FirstFilter> getFirstFilterRegistrationBean() {
        FilterRegistrationBean<FirstFilter> registrationBean = new FilterRegistrationBean<>(new FirstFilter());
        registrationBean.setOrder(1);
        registrationBean.setUrlPatterns(List.of("/TEST/*"));
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean<SecondFilter> getSecondFilterRegistrationBean() {
        FilterRegistrationBean<SecondFilter> registrationBean = new FilterRegistrationBean<>(new SecondFilter());
        registrationBean.setOrder(2);
        registrationBean.setUrlPatterns(List.of("/TEST/*"));
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean<LoginCheckFilter> getLoginCheckFilterRegistrationBean() {
        FilterRegistrationBean<LoginCheckFilter> registrationBean = new FilterRegistrationBean<>(new LoginCheckFilter());
        registrationBean.setOrder(Integer.MIN_VALUE);
        return registrationBean;
    }
}
