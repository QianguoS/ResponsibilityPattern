package com.example.reasonbilitypattern;

public class ViceManager extends Aprove {

	public ViceManager() {
		super(10);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void handle(Worker worker) {
		// TODO Auto-generated method stub
		System.out.println("ViceManager"+"Åú×¼Çë¼Ù"+worker.getName()+worker.getReason()+worker.getDays());
	}

}
