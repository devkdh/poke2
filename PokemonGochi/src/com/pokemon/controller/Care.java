package com.pokemon.controller;

import java.util.Timer;
import java.util.TimerTask;

import com.pokemon.model.vo.Charac;


public class Care {
   public String status;
   
   Charac c = new Charac();
      
   public void eat() {                  //���ֱ�
      if(c.getHp()<100 && c.getHp()>0) {   //hp�� 1�̻� 99�����϶�
         c.setHp(c.getHp()+10);         //hp 10 ����
         c.setClean(c.getClean()-10);   //clean 10 ����
      }
   }
   
   public void ng() {                        //�躯Ȱ��
      if(c.getClean()<100 && c.getClean()>0) {   //clean�� 1�̻� 99�����϶�         
         c.setClean(c.getClean()+10);         //clean 10 ����
         c.setHp(c.getHp()-10);               //hp 10 ����
      }
   }
   
   public void alertStatus() {      //9�� �������� �������� ���� ���
      if (c.getHp()<80 && c.getClean()<80) {      //ü�°� û�ᵵ ��� 80���� ������ �����   
         String[] statusMsg = {"","����Ŀ�", "��������"}; 
         int ran = (int)(Math.random()*3);
         
         //ī��Ʈ�ٿ�
         Timer timer = new Timer();
         TimerTask tTask = new TimerTask() {
            @Override
            public void run() {               
               System.out.println(statusMsg[(int)(Math.random()*2)+1]);
            }
         };      
         timer.schedule(tTask, 9000, 9000);   //9�ʰ������� �ݺ��Ͽ� Ÿ�̸��½�ũ ����
      }
   }

}