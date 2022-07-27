package com.maven.service.serviceimpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maven.dao.DevicetransferRepository;
import com.maven.model.Devicetransfer;
import com.maven.service.DevicetransferService;

@Service
public class DevicetransferServiceImpl implements DevicetransferService{

	 @Autowired 
	 DevicetransferRepository devicetransferRepository;
	 
		 @Override
		 public List<Devicetransfer> findAll() {
		 	// TODO Auto-generated method stub
		  return devicetransferRepository.findAll();
		 }
	    @Override
		public void save(Devicetransfer devicetransfer) {
			// TODO Auto-generated method stub
	    	devicetransferRepository.save(devicetransfer);
		}



		
		
}
