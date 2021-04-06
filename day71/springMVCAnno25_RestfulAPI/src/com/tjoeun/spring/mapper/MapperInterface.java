package com.tjoeun.spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.tjoeun.spring.bean.DataDTO1;

public interface MapperInterface {
	
  @Insert("INSERT INTO SPMVC VALUES(#{name}, #{id}, #{passwd})")
  void insertData(DataDTO1 dto1);
  
  @Select("SELECT NAME, ID, PASSWD FROM SPMVC")
  List<DataDTO1> selectData();
  
  
}
