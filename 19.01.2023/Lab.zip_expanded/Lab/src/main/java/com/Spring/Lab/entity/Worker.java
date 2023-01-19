package com.Spring.Lab.entity;


public class Worker {
	private int id;
	private String wname;
	private Residence residence;
	public Worker() {
		System.out.println("Dep constructor");
	}

	
	public Worker(int id,String wname,Residence residence) {
		super();
		this.id=id;
		this.wname=wname;
		this.residence=residence;
	}
	public void display() {
		System.out.println(id+" "+wname);
		System.out.println(residence.toString());
	}
}
