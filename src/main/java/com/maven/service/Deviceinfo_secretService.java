package com.maven.service;

import java.util.List;

import com.maven.model.Deviceinfo_secret;


public interface  Deviceinfo_secretService {
	
	
//	台账查询(涉密)
	List<Deviceinfo_secret> findByIpContainingAndStatusContaining( String currentusedepartment ,Integer id, String deviceid,String devicemodel, String devicetype, String manufacturersinfo, String serialnumber,String hdisksn, String applicationname) ;
	
//	台账录入(涉密)	
    void save(Deviceinfo_secret deviceinfo_secret) ;    
    
//	台账修改 (涉密)
    
    void updatesecret(Deviceinfo_secret deviceinfo_secret);
    
}
