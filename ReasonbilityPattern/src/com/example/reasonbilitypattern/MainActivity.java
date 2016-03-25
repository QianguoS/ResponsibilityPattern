package com.example.reasonbilitypattern;
//��ʵ��Ϊ������ģʽ����������ģʽ����һ����һ��ʵ����Ϊ�˹�����ѧ��������ģʽ
/*
 * ���Ա���������С��3�죬���ο��������ü��������Ա������������ڵ���3�죬С��10�죬
 * ����������������Ա������������ڵ���10�죬С��30�죬
 * �ܾ�������������������30�죬�ܾ���Ҳ������������ʾ��Ӧ�ľܾ���Ϣ��
 * ����ְ����ģʽ��Ƹü�������ģ�顣
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
        System.out.println("��ʼ��");
    }

	private void initWorker() {
		// TODO Auto-generated method stub
		work1 = new Worker("����", 2, "��Ϣ����");
		work2 = new Worker("����", 6, "��Ҫѵ��");
		work3 = new Worker("����", 20, "��Ҫ����");
		//work4 = new Worker("��ţ", 30, "��Ҫ��ҵ");
		
		director = new Director();
		viceManager = new ViceManager();
		manager = new Manager();
		
		director.setSuccesor(viceManager);
		viceManager.setSuccesor(manager);
		
	}
    
    
}
