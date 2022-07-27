package com.maven.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Devicetype {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int    devicetypeid;       //设备类型id
	private String devicetypename;     //设备类型名称
	
	
	public int getDevicetypeid() {
		return devicetypeid;
	}
	public void setDevicetypeid(int devicetypeid) {
		this.devicetypeid = devicetypeid;
	}
	public String getDevicetypename() {
		return devicetypename;
	}
	public void setDevicetypename(String devicetypename) {
		this.devicetypename = devicetypename;
	}
}
