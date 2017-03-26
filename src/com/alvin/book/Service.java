package com.alvin.book;

public class Service {
	
	private Dao dao;
	
	
	public void add(){
		System.out.println("add...");
		dao.add();
	}


	public Dao getDao() {
		return dao;
	}


	public void setDao(Dao dao) {
		this.dao = dao;
	}

}
