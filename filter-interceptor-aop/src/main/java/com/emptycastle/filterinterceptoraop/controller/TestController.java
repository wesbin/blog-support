package com.emptycastle.filterinterceptoraop.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/TEST")
public class TestController {

    @PostMapping("/POST")
    public ResponseEntity<String> POST(@RequestBody Map<String, String> body) {
        return new ResponseEntity<>("GOOD", HttpStatus.OK);
    }
}
