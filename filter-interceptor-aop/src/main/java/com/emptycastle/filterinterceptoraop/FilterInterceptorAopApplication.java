package com.emptycastle.filterinterceptoraop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class FilterInterceptorAopApplication {

    public static void main(String[] args) {
        SpringApplication.run(FilterInterceptorAopApplication.class, args);
    }

}
