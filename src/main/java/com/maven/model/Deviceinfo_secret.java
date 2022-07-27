package com.maven.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity

public class Deviceinfo_secret {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int    id;           //id
	private String deviceid;     //设备编号
	private String deviceassetid;//设备资产编号
	private String devicetype; //设备类型
	private String manufacturersinfo;//制造厂家
	private String devicemodel;      //型号
	private String applicationname;  //所属应用系统
	private String currentusedepartment;  //使用部门
	private String currentinstalllocation;//安装（使用）位置
	private String currentuseperson;      //使用人
	private String currentpersonincharge; //责任人
	private String IPaddress;       //IP地址
	private String distributiondate;//派发时间
	
	private String secretinfo;      //密级	
	private String madein;          //是否国产
	private String serialnumber;    //序列号
	private String CPUinfo;         //CPU
	private String meminfo;   //内存
	private String hdiskinfo; //硬盘
	private String hdisksn;   //硬盘序列号
    private String OSinfo;    //操作系统
	private String DBinfo;    //数据库
	private String appinfo;   //主要应用软件
	private String remarkinfo;//备注
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeviceid() {
		return deviceid;
	}
	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}
	public String getDeviceassetid() {
		return deviceassetid;
	}
	public void setDeviceassetid(String deviceassetid) {
		this.deviceassetid = deviceassetid;
	}
	public String getDevicetype() {
		return devicetype;
	}
	public void setDevicetype(String devicetype) {
		this.devicetype = devicetype;
	}
	public String getManufacturersinfo() {
		return manufacturersinfo;
	}
	public void setManufacturersinfo(String manufacturersinfo) {
		this.manufacturersinfo = manufacturersinfo;
	}
	public String getDevicemodel() {
		return devicemodel;
	}
	public void setDevicemodel(String devicemodel) {
		this.devicemodel = devicemodel;
	}
	public String getApplicationname() {
		return applicationname;
	}
	public void setApplicationname(String applicationname) {
		this.applicationname = applicationname;
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
	public String getIPaddress() {
		return IPaddress;
	}
	public void setIPaddress(String iPaddress) {
		IPaddress = iPaddress;
	}
	public String getDistributiondate() {
		return distributiondate;
	}
	public void setDistributiondate(String distributiondate) {
		this.distributiondate = distributiondate;
	}
	public String getSecretinfo() {
		return secretinfo;
	}
	public void setSecretinfo(String secretinfo) {
		this.secretinfo = secretinfo;
	}
	public String getMadein() {
		return madein;
	}
	public void setMadein(String madein) {
		this.madein = madein;
	}
	public String getSerialnumber() {
		return serialnumber;
	}
	public void setSerialnumber(String serialnumber) {
		this.serialnumber = serialnumber;
	}
	public String getCPUinfo() {
		return CPUinfo;
	}
	public void setCPUinfo(String cPUinfo) {
		CPUinfo = cPUinfo;
	}
	public String getMeminfo() {
		return meminfo;
	}
	public void setMeminfo(String meminfo) {
		this.meminfo = meminfo;
	}
	public String getHdiskinfo() {
		return hdiskinfo;
	}
	public void setHdiskinfo(String hdiskinfo) {
		this.hdiskinfo = hdiskinfo;
	}
	public String getHdisksn() {
		return hdisksn;
	}
	public void setHdisksn(String hdisksn) {
		this.hdisksn = hdisksn;
	}
	public String getOSinfo() {
		return OSinfo;
	}
	public void setOSinfo(String oSinfo) {
		OSinfo = oSinfo;
	}
	public String getDBinfo() {
		return DBinfo;
	}
	public void setDBinfo(String dBinfo) {
		DBinfo = dBinfo;
	}
	public String getAppinfo() {
		return appinfo;
	}
	public void setAppinfo(String appinfo) {
		this.appinfo = appinfo;
	}
	public String getRemarkinfo() {
		return remarkinfo;
	}
	public void setRemarkinfo(String remarkinfo) {
		this.remarkinfo = remarkinfo;
	}
	

	

}
