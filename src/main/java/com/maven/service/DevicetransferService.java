package com.maven.service;

import java.util.List;

//import java.util.List;


import com.maven.model.Devicetransfer;

public interface  DevicetransferService {

	List<Devicetransfer> findAll();
			
    void save(Devicetransfer devicetransfer) ;
    

}
