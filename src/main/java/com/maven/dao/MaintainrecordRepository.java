package com.maven.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;


import com.maven.model.Maintainrecord;

public interface  MaintainrecordRepository extends JpaRepository<Maintainrecord, Integer>{
//  故障派单查询 	
	@Query(value="select * from maintainrecord where repairinfo like '%未%' ",nativeQuery=true)
	List<Maintainrecord> findByFirstname();
	
//  设备维修查询
	@Query(value="select * from maintainrecord where repairinfo like '%待%' ",nativeQuery=true)
	List<Maintainrecord> findByFirstnameIs();
}
