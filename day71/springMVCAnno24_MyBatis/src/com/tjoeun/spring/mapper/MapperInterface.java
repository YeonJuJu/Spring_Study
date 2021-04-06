package com.tjoeun.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.tjoeun.spring.bean.DataDTO1;

public interface MapperInterface {
	@Insert("insert into spmvc values(#{name}, #{id}, #{passwd})")
	void insertData(DataDTO1 dto1);
	
	@Select("select name, id, passwd from spmvc")
	List<DataDTO1> selectdata();
}
