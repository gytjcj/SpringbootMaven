package com.maven.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.maven.model.Deviceinfo_notsecret;


public interface  Deviceinfo_notsecretRepository extends JpaRepository<Deviceinfo_notsecret, Integer>{
//台账查询(非涉密)
List<Deviceinfo_notsecret> findlikenotsecret(Deviceinfo_notsecret deviceinfo_notsecret);

//	@Query(value="select * from deviceinfo_notsecret b where IF(ifnull(:id,'') != '',               b.id                     like  CONCAT('%',:id,'%'),1=1)"
//			+ "AND IF(ifnull(:currentusedepartment,'') != '',   b.currentusedepartment like  CONCAT('%',:currentusedepartment,'%'),1=1) "
//			+ "AND IF(ifnull(:deviceid,'') != ''   ,      b.deviceid               like  CONCAT('%',:deviceid,'%'),1=1)"
//			+ "AND IF(ifnull(:devicemodel,'') != '',      b.devicemodel       	 like  CONCAT('%',:devicemodel,'%'),1=1)"
//			+ "AND IF(ifnull(:Devicetype,'') != '' ,      b.devicetype        	 like  CONCAT('%',:Devicetype,'%'),1=1)"
//			+ "AND IF(ifnull(:manufacturersinfo,'') != '',b.manufacturersinfo 	 like  CONCAT('%',:manufacturersinfo,'%'),1=1)"
//			+ "AND IF(ifnull(:serialnumber,'') != '',     b.serialnumber      	 like  CONCAT('%',:serialnumber,'%'),1=1)"
//			+ "AND IF(ifnull(:hdisksn,'') != ''    ,      b.hdisksn           	 like  CONCAT('%',:hdisksn,'%'),1=1)"
//			+ "AND IF(ifnull(:applicationname,'') != '',  b.applicationname   	 like  CONCAT('%',:applicationname,'%'),1=1)",nativeQuery=true)
////devicemodel, Devicetype, manufacturersinfo, serialnumber, hdisksn, applicationname
//	List<Deviceinfo_notsecret> findByIpContainingAndStatusContaining( @Param("id")                   Integer id,
//																	  @Param("currentusedepartment") String currentusedepartment ,
//																	  @Param("deviceid")             String deviceid,
//																	  @Param("devicemodel")          String devicemodel,
//																	  @Param("Devicetype")           String devicetype,
//																	  @Param("manufacturersinfo")    String manufacturersinfo,
//																	  @Param("serialnumber")         String serialnumber,
//																	  @Param("hdisksn")              String hdisksn,
//																	  @Param("applicationname")      String applicationname);


}
