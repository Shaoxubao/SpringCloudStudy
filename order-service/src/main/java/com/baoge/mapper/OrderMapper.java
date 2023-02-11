package com.baoge.mapper;

import com.baoge.pojo.Order;
import org.apache.ibatis.annotations.Select;

public interface OrderMapper {

    @Select("select * from t_order where id = #{id}")
    Order findById(Long id);
}
