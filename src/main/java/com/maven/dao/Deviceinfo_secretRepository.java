package com.maven.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.maven.model.Deviceinfo_secret;

public interface  Deviceinfo_secretRepository extends JpaRepository<Deviceinfo_secret, Integer>{
//台账查询(涉密)
@Query(value="select * from deviceinfo_secret a where  IF(ifnull(:currentusedepartment,'') != '', a.currentusedepartment like  CONCAT('%',:currentusedepartment,'%'),1=1)"
												+ "AND IF(ifnull(:id,'') != '',               	  a.id                   like  CONCAT('%',:id,'%'),1=1)"
												+ "AND IF(ifnull(:deviceid,'') != '',             a.deviceid          	 like  CONCAT('%',:deviceid,'%'),1=1)"
												+ "AND IF(ifnull(:devicemodel,'') != '',      	  a.devicemodel       	 like  CONCAT('%',:devicemodel,'%'),1=1)"
											  	+ "AND IF(ifnull(:Devicetype,'') != '',       	  a.devicetype        	 like  CONCAT('%',:Devicetype,'%'),1=1)"
												+ "AND IF(ifnull(:manufacturersinfo,'') != '',	  a.manufacturersinfo  	 like  CONCAT('%',:manufacturersinfo,'%'),1=1)"
											  	+ "AND IF(ifnull(:serialnumber,'') != '',     	  a.serialnumber      	 like  CONCAT('%',:serialnumber,'%'),1=1)"
												+ "AND IF(ifnull(:hdisksn,'') != '',          	  a.hdisksn          	 like  CONCAT('%',:hdisksn,'%'),1=1)"
											  	+ "AND IF(ifnull(:applicationname,'') != '',  	  a.applicationname   	 like  CONCAT('%',:applicationname,'%'),1=1)",nativeQuery=true)
//devicemodel, Devicetype, manufacturersinfo, serialnumber, hdisksn, applicationname
List<Deviceinfo_secret> findByIpContainingAndStatusContaining(  @Param("currentusedepartment") String currentusedepartment ,
															    @Param("id")                   Integer id,
																@Param("deviceid")   		   String deviceid,
																@Param("devicemodel") 		   String devicemodel,
																@Param("Devicetype")   		   String devicetype,
																@Param("manufacturersinfo")    String manufacturersinfo,
																@Param("serialnumber")         String serialnumber,
																@Param("hdisksn")              String hdisksn,
																@Param("applicationname")      String applicationname);

}
