package com.Spring.Lab.entity;

public class Classroom {
	private int sec;
	private String tname;
	public Classroom() {
		System.out.println("Dep constructor");
	}
	public Classroom(int sec) {
		this.sec=sec;
	}
	public Classroom(String tname) {
		this.tname=tname;
	}
	public Classroom(int id,String tname) {
		this.sec=sec;
		this.tname=tname;
	}
	public void display() {
		System.out.println(sec+" "+tname);
	}
}
