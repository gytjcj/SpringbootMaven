package com.maven.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maven.dao.ReceiverinfoRepository;
import com.maven.model.Receiverinfo;
import com.maven.service.ReceiverinfoService;


@Service
public class ReceiverinfoServiceImpl implements ReceiverinfoService{
	
	@Autowired 
	ReceiverinfoRepository receiverinfoRepository;
	
	 @Override
	 public List<Receiverinfo> findAll() {
	 	// TODO Auto-generated method stub
	  return receiverinfoRepository.findAll();
	 }

}
