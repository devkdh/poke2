package com.pokemon.controller;

import java.util.Scanner;

import com.pokemon.model.vo.Charac;

public class Battle {
	
	Charac c = new Charac();

	int Enemyhp = (int)(Math.random()*45+30); //�� ü��
	int EnemyAttack =(int)(Math.random()*10+15);//�� ���ݷ�
	int playerDamage = c.getLevel()*19;//�������� ���ݷ� 19�� ����
	int playerHp = 100;
	int playerExp = c.getExp();
	int penalty = c.getHp()-10;

	public void playersetAttack()  //�÷��̾� ����-��ü�� ����
	{Enemyhp -=playerDamage;}
	public void enemysetDefense() //�� ���- �� ü�� 0 ����
	{Enemyhp -= 0;}
	public void playersetDefense() // �÷��̾� ��� - �÷��̾� ü�� 0 ����
	{playerHp -= 0 ;}
	public void enemysetAttack() // �� ���� (int)(Math.random()*10+10) �� ������
	{playerHp-=EnemyAttack;}

	public int enemygetAttack() //�÷��̾� ���ݹ����� �÷��̾� ü��
	{   
	   System.out.println("�÷��̾��� ������:"+playerHp);
	   return playerHp;}

	public int enemygetDefense() //�� ���� �� ü��
	{System.out.println("��������:"+Enemyhp);
	   return Enemyhp;}

	public int playergetAttack() //�÷��̾� ���ݽ� �� ü��
	{System.out.println("��������:"+Enemyhp);
	   return Enemyhp;}

	public int playergetDefense() //�÷��̾� ���� �÷��̾� ü��
	{System.out.println("�÷��̾��� ������:"+playerHp);
	   return playerHp;
	}
	public int play() {
	   do {
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.println("���� ������"+Enemyhp);
	   System.out.println("�÷��̾��� ������"+ playerHp);
	   System.out.println("\n��ư�� �Է�");
	   int i= sc.nextInt();
	   int ran = (int)(Math.random()*3+1);
	   switch(i) {
	   case 1: 
	   if(ran==1||ran==3) {
	      System.out.println("�÷��̾� ����");
	      System.out.println(playerDamage+"�� ���ظ� ������.");
	      playersetAttack();
	      playergetAttack();
	      System.out.println("�� ����");
	      System.out.println(EnemyAttack+"�� ���ظ� �޾Ҵ�.");
	      enemysetAttack();
	      enemygetAttack();
	   }else {
	      enemysetDefense();
	      enemygetDefense();
	      System.out.println("���� ����");
	      System.out.println("���� ���� ���� 0");
	   }
	   break;
	   case 2:
	      if(ran==1||ran==3) {
	         playersetDefense();
	         playergetDefense();
	         System.out.println("�÷��̾ ����");
	      }else {
	         System.out.println("���� �������� ����");   
	      }
	      break;
	   case 3:
	      System.out.println("�������� ����, ���� ���Ƽ ü�� 10 ����");
	      System.out.println("�÷��̾� ü��"+penalty);
	      playerHp = 100;
	      Enemyhp = (int)(Math.random()*45+30);
	      return penalty=c.getHp();
	   default:
	   }
	   }
	   while(Enemyhp>=1);
	   if(Enemyhp<1) {
	   System.out.println("�������� �¸�");
	   c.setExp(c.getExp()+50);
	   System.out.println("�����¸� ����ġ 50 ȹ��");
	   System.out.println("�������ġ"+c.getExp());
	   playerHp = 100;
	   Enemyhp = (int)(Math.random()*45+30);
	   }
	   return playerExp=c.getExp();
	}


}
