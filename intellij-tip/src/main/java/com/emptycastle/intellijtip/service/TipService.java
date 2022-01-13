package com.emptycastle.intellijtip.service;

import com.emptycastle.intellijtip.mapper.TipMapper;
import com.emptycastle.intellijtip.model.Tip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TipService {

    @Autowired
    TipMapper tipMapper;

    public List<Tip> tip1() {
        return tipMapper.tip1();
    }
}
