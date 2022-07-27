package com.maven.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maven.dao.DevicetypeRepository;
import com.maven.model.Devicetype;
import com.maven.service.DevicetypeService;

@Service
public class DevicetypeServiceImpl implements DevicetypeService{
	
	@Autowired 
	DevicetypeRepository devicetypeRepository;
	
	 @Override
	 public List<Devicetype> findAll() {
	 	// TODO Auto-generated method stub
	  return devicetypeRepository.findAll();
	 }
}
