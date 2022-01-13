package com.emptycastle.intellijtip.mapper;

import com.emptycastle.intellijtip.model.Tip;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TipMapper {
    List<Tip> tip1();
}
