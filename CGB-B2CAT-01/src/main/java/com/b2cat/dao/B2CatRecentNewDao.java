package com.b2cat.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.b2cat.entity.Syspost;


@Mapper
public interface B2CatRecentNewDao {
	@Select("select id from post ")
	int getRowCount(Integer id);
	
	List<Syspost> findPageLog(
			@Param("id") Integer id,
			@Param("startIndex")Integer startIndex,
			@Param("pageSize")Integer pageSize);
	
}
