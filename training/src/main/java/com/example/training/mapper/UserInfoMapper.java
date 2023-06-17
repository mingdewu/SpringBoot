package com.example.training.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import com.example.training.entity.UserInfo;

@Mapper
public interface UserInfoMapper {
    List<UserInfo> selectAll();
}
