package com.maven.service.serviceimpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maven.dao.Deviceinfo_notsecretRepository;
import com.maven.model.Deviceinfo_notsecret;

import com.maven.service.Deviceinfo_notsecretService;


@Service
public class Deviceinfo_notsecretServiceImpl implements Deviceinfo_notsecretService{
//	台账查询Repository注入(非涉密)
	 @Autowired 
	 	Deviceinfo_notsecretRepository deviceinfo_notsecretRepository; 	    

//	台账查询(非涉密)
//   @Override
		public List<Deviceinfo_notsecret> findByIpContainingAndStatusContaining(Integer id, String currentusedepartment ,String deviceid,String devicemodel, String devicetype, String manufacturersinfo, String serialnumber, String hdisksn, String applicationname) {
			// TODO Auto-generated method stub
			
			return deviceinfo_notsecretRepository.findByIpContainingAndStatusContaining(id,currentusedepartment,deviceid,devicemodel, devicetype, manufacturersinfo, serialnumber, hdisksn, applicationname);
		}

//	台账录入(非涉密)
	 @Override
	    public void save(Deviceinfo_notsecret deviceinfo_notsecret) {
	    	deviceinfo_notsecretRepository.save(deviceinfo_notsecret);
	        
	    }
		
//	台账修改(非涉密)
	 @Override
	    public void updatenotsecret(Deviceinfo_notsecret deviceinfo_notsecret) {
	        // TODO Auto-generated method stub
		 deviceinfo_notsecretRepository.save(deviceinfo_notsecret);
	        
	    }	    

		
		
		
}
