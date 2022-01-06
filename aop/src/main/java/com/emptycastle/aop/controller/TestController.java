package com.emptycastle.aop.controller;

import com.emptycastle.aop.aspect.SummaryLogAnnotation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/TEST")
    public String test() {
        return "TEST";
    }

    @SummaryLogAnnotation
    @PostMapping("/TEST2")
    public String test2(RequestBody body) {
        return "TEST";
    }
}
