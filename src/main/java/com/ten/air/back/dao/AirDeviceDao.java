package com.ten.air.back.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

import com.ten.air.back.entity.AirDevice;

public interface AirDeviceDao {

    int insert(@Param("pojo") AirDevice pojo);

    int insertList(@Param("pojos") List<AirDevice> pojo);

    List<AirDevice> select(@Param("pojo") AirDevice pojo);

    int update(@Param("pojo") AirDevice pojo);

}
