package com.yee.hospital.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yee.hospital.model.HospitalSet;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface HospitalSetMapper extends BaseMapper<HospitalSet> {

}
