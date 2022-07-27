package com.maven.service.serviceimpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maven.dao.Deviceinfo_secretRepository;

import com.maven.model.Deviceinfo_secret;
import com.maven.service.Deviceinfo_secretService;

@Service
public class Deviceinfo_secretServiceImpl implements Deviceinfo_secretService{
//	台账查询Repository注入(涉密)	
	 @Autowired 
	 	Deviceinfo_secretRepository deviceinfo_secretRepository;

	 
//	台账查询(涉密)
//	 @Override
		public List<Deviceinfo_secret> findByIpContainingAndStatusContaining( String currentusedepartment ,Integer id ,String deviceid,String devicemodel, String devicetype, String manufacturersinfo, String serialnumber,String hdisksn, String applicationname) {
			// TODO Auto-generated method stub
			
			return deviceinfo_secretRepository.findByIpContainingAndStatusContaining(currentusedepartment ,id, deviceid,devicemodel, devicetype, manufacturersinfo, serialnumber, hdisksn, applicationname);
		}

//	台账录入(涉密)
	 @Override
	    public void save(Deviceinfo_secret deviceinfo_secret) {
	    	
	    	deviceinfo_secretRepository.save(deviceinfo_secret);
	    }
	   
//	台账修改(涉密)
	  
	 @Override
	    public void updatesecret(Deviceinfo_secret deviceinfo_secret) {
	        // TODO Auto-generated method stub
	    	deviceinfo_secretRepository.save(deviceinfo_secret);
	        
	    }		
    

		
		
		
}
