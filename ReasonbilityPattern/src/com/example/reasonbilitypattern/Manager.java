package com.example.reasonbilitypattern;

public class Manager extends Aprove {

	public Manager() {
		super(30);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handle(Worker worker) {
		// TODO Auto-generated method stub
		System.out.println("Manager"+"��׼���"+worker.getName()+worker.getReason()+worker.getDays());
	}

}
