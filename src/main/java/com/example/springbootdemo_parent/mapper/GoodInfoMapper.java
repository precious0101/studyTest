package com.example.springbootdemo_parent.mapper;

import com.example.springbootdemo_parent.bean.GoodInfoBean;
import com.example.springbootdemo_parent.bean.GoodTypeBean;
import com.example.springbootdemo_parent.dto.GoodInfoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * 配置映射
 * ========================
 * Created with IntelliJ IDEA.
 * User：Jillian Zhu
 * Date：2017/8/20
 * Time：11:26
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
//@Mapper
@Mapper(componentModel = "spring")
public interface GoodInfoMapper {
    //public static GoodInfoMapper MAPPER = Mappers.getMapper(GoodInfoMapper.class);

    @Mappings({
            @Mapping(source = "type.name",target = "typeName"),
            @Mapping(source = "good.id",target = "goodId"),
            @Mapping(source = "good.title",target = "goodName"),
            @Mapping(source = "good.price",target = "goodPrice")
    })
    public GoodInfoDTO from(GoodInfoBean good, GoodTypeBean type);
}
