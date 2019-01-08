package com.lirong.dao;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.lirong.pojo.Users;
@Mapper
public interface UserMapper {
	public List<Users> getUserList();
}
