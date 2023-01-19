package com.Spring.Lab.entity;

import java.util.Iterator;
import java.util.List;

public class Cinema {
	private int id;
	private String cname;
	private List<String> movie;
	public Cinema() {
		super();
	}
	public Cinema(int id, String cname, List<String> movie) {
		super();
		this.id = id;
		this.cname = cname;
		this.movie = movie;
	}
	public void display() {
		System.out.println(id+" "+cname);
		System.out.println("Answer are :");
		Iterator<String> itr=movie.iterator();
	while(itr.hasNext()) {
	System.out.println(itr.next());
	}
	}
}
