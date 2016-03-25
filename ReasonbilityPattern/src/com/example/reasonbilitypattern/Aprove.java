package com.example.reasonbilitypattern;

public abstract class Aprove {

	private Aprove msuccesor;
	private int days;
	public Aprove(int days) {
		//super();
		this.days = days;
	}
	public void setSuccesor(Aprove succesor) {
		this.msuccesor = succesor;
	}
	public abstract void handle(Worker worker);
	public void processor(Worker worker){
		if(worker.getDays() <= days){
			handle(worker);
		}else{
			this.msuccesor.processor(worker);
		}
	}
	
	
}
