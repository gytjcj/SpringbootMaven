package com.maven.service;

import java.util.List;

import com.maven.model.Maintainrecord;

public interface  MaintainrecordService {
//  故障派单查询 	
    List<Maintainrecord> findByFirstname();
    
//  设备维修查询 
	List<Maintainrecord> findByFirstnameIs();
	
//	故障申报 	
    void save(Maintainrecord maintainrecord);
    
//	故障派单   
void updatemaintainrecord(Maintainrecord maintainrecord);
}
