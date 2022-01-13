package com.emptycastle.intellijtip.controller;

import com.emptycastle.intellijtip.model.Tip;
import com.emptycastle.intellijtip.service.TipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TipController {

    @Autowired
    TipService tipService;

    @GetMapping("/tip1")
    public List<Tip> tip1() {
        return tipService.tip1();
    }
}
