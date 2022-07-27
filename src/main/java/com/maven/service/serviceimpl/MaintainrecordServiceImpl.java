package com.maven.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maven.dao.MaintainrecordRepository;
import com.maven.model.Maintainrecord;
import com.maven.service.MaintainrecordService;

@Service
public class MaintainrecordServiceImpl implements MaintainrecordService{
	 @Autowired
	 MaintainrecordRepository maintainrecordRepository;
//   故障派单查询 
	    @Override
	    public List<Maintainrecord> findByFirstname() {
	        // TODO Auto-generated method stub
	        return maintainrecordRepository.findByFirstname();
	    }
//    设备维修查询 
	    @Override
	    public List<Maintainrecord> findByFirstnameIs() {
	        // TODO Auto-generated method stub
	        return maintainrecordRepository.findByFirstnameIs();
	    }
//		故障申报   
	    @Override
	    public void save(Maintainrecord maintainrecord) {
	    	maintainrecordRepository.save(maintainrecord);
	        
	    }
//		故障派单
//	    @Override
	    public void updatemaintainrecord(Maintainrecord maintainrecord) {
	        // TODO Auto-generated method stub
	    	maintainrecordRepository.save(maintainrecord);
	        
	    }
}
