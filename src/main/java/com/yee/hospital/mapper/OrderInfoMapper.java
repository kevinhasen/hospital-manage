package com.yee.hospital.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yee.hospital.model.OrderInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface OrderInfoMapper extends BaseMapper<OrderInfo> {

}
