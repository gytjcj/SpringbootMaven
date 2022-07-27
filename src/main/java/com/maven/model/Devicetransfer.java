package com.maven.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity

public class Devicetransfer {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int devicetransferid;//设备移交编号
	 private String deviceassetid;//设备资产编号
     private String deviceid;     //设备编号
     private String currentusedepartment;  //变更后的使用部门
     private String currentinstalllocation;//变更后的安装（使用）位置
     private String currentuseperson;      //变更后的使用人
     private String currentpersonincharge; //变更后的责任人
     private String oldusedepartment;  //上任使用部门
     private String oldinstalllocation;//上任安装（使用）位置
     private String olduseperson;      //上任使用人
     private String oldpersonincharge; //上任责任人
     private String transferdate;      //移交时间
	public int getDevicetransferid() {
		return devicetransferid;
	}
	public void setDevicetransferid(int devicetransferid) {
		this.devicetransferid = devicetransferid;
	}
	public String getDeviceassetid() {
		return deviceassetid;
	}
	public void setDeviceassetid(String deviceassetid) {
		this.deviceassetid = deviceassetid;
	}
	public String getDeviceid() {
		return deviceid;
	}
	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}
	public String getCurrentusedepartment() {
		return currentusedepartment;
	}
	public void setCurrentusedepartment(String currentusedepartment) {
		this.currentusedepartment = currentusedepartment;
	}
	public String getCurrentinstalllocation() {
		return currentinstalllocation;
	}
	public void setCurrentinstalllocation(String currentinstalllocation) {
		this.currentinstalllocation = currentinstalllocation;
	}
	public String getCurrentuseperson() {
		return currentuseperson;
	}
	public void setCurrentuseperson(String currentuseperson) {
		this.currentuseperson = currentuseperson;
	}
	public String getCurrentpersonincharge() {
		return currentpersonincharge;
	}
	public void setCurrentpersonincharge(String currentpersonincharge) {
		this.currentpersonincharge = currentpersonincharge;
	}
	public String getOldusedepartment() {
		return oldusedepartment;
	}
	public void setOldusedepartment(String oldusedepartment) {
		this.oldusedepartment = oldusedepartment;
	}
	public String getOldinstalllocation() {
		return oldinstalllocation;
	}
	public void setOldinstalllocation(String oldinstalllocation) {
		this.oldinstalllocation = oldinstalllocation;
	}
	public String getOlduseperson() {
		return olduseperson;
	}
	public void setOlduseperson(String olduseperson) {
		this.olduseperson = olduseperson;
	}
	public String getOldpersonincharge() {
		return oldpersonincharge;
	}
	public void setOldpersonincharge(String oldpersonincharge) {
		this.oldpersonincharge = oldpersonincharge;
	}
	public String getTransferdate() {
		return transferdate;
	}
	public void setTransferdate(String transferdate) {
		this.transferdate = transferdate;
	}
	
     
    
}
