package com.maven.service;

import java.util.List;

import com.maven.model.Deviceinfo_notsecret;


public interface  Deviceinfo_notsecretService {
	
//	台账查询(非涉密)
	List<Deviceinfo_notsecret> findByIpContainingAndStatusContaining(Integer id, String currentusedepartment,String deviceid,String devicemodel, String devicetype, String manufacturersinfo, String serialnumber, String hdisksn, String applicationname) ;
   
//	台账录入(非涉密)	
    void save(Deviceinfo_notsecret deviceinfo_notsecret) ;
   
//	台账修改 (非涉密) 
    void updatenotsecret(Deviceinfo_notsecret deviceinfo_notsecret);
}
