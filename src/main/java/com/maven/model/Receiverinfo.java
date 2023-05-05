package com.maven.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Receiverinfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int    receiverinfoid;       //维修人id
	private String receiverinfoname;     //维修人姓名
	
	public int getReceiverinfoid() {
		return receiverinfoid;
	}
	public void setReceiverinfoid(int receiverinfoid) {
		this.receiverinfoid = receiverinfoid;
	}
	public String getReceiverinfoname() {
		return receiverinfoname;
	}
	public void setReceiverinfoname(String receiverinfoname) {
		this.receiverinfoname = receiverinfoname;
	}
	
	
}
