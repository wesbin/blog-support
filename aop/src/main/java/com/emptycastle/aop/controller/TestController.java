package com.emptycastle.aop.controller;

import com.emptycastle.aop.aspect.CommonLogAnnotation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/TEST")
    public String test() {
        return "TEST";
    }

    @CommonLogAnnotation
    @PostMapping("/TEST2")
    public String test2(@RequestBody Map<String, String> body) {
        logger.info("TEST2 proceed");
        return "TEST";
    }
}
