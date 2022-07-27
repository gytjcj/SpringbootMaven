package com.maven.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity

public class Maintainrecord {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer maintainrecordid;//维修编号
	private String deviceassetid;//设备资产编号
	private String deviceid;     //设备编号
	private String repairasktime;//报修时间
	private String repairaskoffice;//报修处室
	private String repairaskpeople;//报修人
	private String responsetime;   //响应时间
	private String repairinfo;     //是否修复
	private String repairfinishtime;//修复时间
	private String faulttype;       //故障类型
	private String failurecause;    //故障原因
	private String resolvemethod;   //解决方法
	private String sparepart;       //备件情况
	private String satisfactioninfo;//本次维修满意度
	private String receiver;        //维修人
	private String description;     //故障简要描述
	private String remarkinfo;      //备注
	
	
	public Integer getMaintainrecordid() {
		return maintainrecordid;
	}
	public void setMaintainrecordid(Integer maintainrecordid) {
		this.maintainrecordid = maintainrecordid;
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
	public String getRepairasktime() {
		return repairasktime;
	}
	public void setRepairasktime(String repairasktime) {
		this.repairasktime = repairasktime;
	}
	public String getRepairaskoffice() {
		return repairaskoffice;
	}
	public void setRepairaskoffice(String repairaskoffice) {
		this.repairaskoffice = repairaskoffice;
	}
	public String getRepairaskpeople() {
		return repairaskpeople;
	}
	public void setRepairaskpeople(String repairaskpeople) {
		this.repairaskpeople = repairaskpeople;
	}
	public String getResponsetime() {
		return responsetime;
	}
	public void setResponsetime(String responsetime) {
		this.responsetime = responsetime;
	}
	public String getRepairinfo() {
		return repairinfo;
	}
	public void setRepairinfo(String repairinfo) {
		this.repairinfo = repairinfo;
	}
	public String getRepairfinishtime() {
		return repairfinishtime;
	}
	public void setRepairfinishtime(String repairfinishtime) {
		this.repairfinishtime = repairfinishtime;
	}
	public String getFaulttype() {
		return faulttype;
	}
	public void setFaulttype(String faulttype) {
		this.faulttype = faulttype;
	}
	public String getFailurecause() {
		return failurecause;
	}
	public void setFailurecause(String failurecause) {
		this.failurecause = failurecause;
	}
	public String getResolvemethod() {
		return resolvemethod;
	}
	public void setResolvemethod(String resolvemethod) {
		this.resolvemethod = resolvemethod;
	}
	public String getSparepart() {
		return sparepart;
	}
	public void setSparepart(String sparepart) {
		this.sparepart = sparepart;
	}
	public String getSatisfactioninfo() {
		return satisfactioninfo;
	}
	public void setSatisfactioninfo(String satisfactioninfo) {
		this.satisfactioninfo = satisfactioninfo;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRemarkinfo() {
		return remarkinfo;
	}
	public void setRemarkinfo(String remarkinfo) {
		this.remarkinfo = remarkinfo;
	}
	
	

}