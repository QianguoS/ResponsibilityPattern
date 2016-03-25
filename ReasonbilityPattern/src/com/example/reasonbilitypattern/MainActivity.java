package com.example.reasonbilitypattern;
//本实例为责任链模式，是责任链模式书上一个想一想实例，为了巩固所学的责任链模式
/*
 * 如果员工请假天数小于3天，主任可以审批该假条；如果员工请假天数大于等于3天，小于10天，
 * 经理可以审批；如果员工请假天数大于等于10天，小于30天，
 * 总经理可以审批；如果超过30天，总经理也不能审批，提示相应的拒绝信息。
 * 试用职责链模式设计该假条审批模块。
 * */
 import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

 public class MainActivity extends Activity {
	 
	 private Worker work1,work2,work3,work4;
	 private Aprove director,viceManager,manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWorker();
        director.processor(work1);
        director.processor(work2);
        director.processor(work3);
        System.out.println("开始了");
    }

	private void initWorker() {
		// TODO Auto-generated method stub
		work1 = new Worker("赵四", 2, "休息两天");
		work2 = new Worker("李宁", 6, "我要训练");
		work3 = new Worker("李三", 20, "我要旅游");
		//work4 = new Worker("大牛", 30, "我要创业");
		
		director = new Director();
		viceManager = new ViceManager();
		manager = new Manager();
		
		director.setSuccesor(viceManager);
		viceManager.setSuccesor(manager);
		
	}
    
    
}
