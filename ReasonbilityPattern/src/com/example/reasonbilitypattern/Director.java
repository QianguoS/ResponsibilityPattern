package com.example.reasonbilitypattern;

import android.util.Log;

public class Director extends Aprove {

	public Director() {
		super(3);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void handle(Worker worker) {
		// TODO Auto-generated method stub
		System.out.println("Director"+"Åú×¼Çë¼Ù"+worker.getName()+worker.getReason()+worker.getDays());
		Log.i("Director", worker.getName());
	}

}
