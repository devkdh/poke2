package com.pokemon.view;

import java.util.Timer;
import java.util.TimerTask;

import com.pokemon.model.vo.Charac;


public class Game {
	private int kind = (int)(Math.random()*3); //���ϸ��� ���� ����
	
	public int getKind() {
		return kind;
	}

	public void setKind(int kind) {
		this.kind = kind;
	}
	Charac pokemon = new Charac(kind); //ĳ���ͷ� ������

	/* ���� start��ư Ŭ�� ��, ĳ���� ���������� ���ð� �ҿ� */ 
	public void hatch() {
		//ī��Ʈ�ٿ�
        Timer timer = new Timer();
        TimerTask tTask = new TimerTask() {
           @Override
           public void run() {
				System.out.println(pokemon.toString());
				System.out.println(pokemon.getName()+"�� �¾���ϴ�!");
           }
        };      
        timer.schedule(tTask, 3000);	
	}

	/* ����ġ�� 100�� �Ǿ����� level&name �� ���� */
	public void levelUp(Charac c) {
		String name = "";
		if(c.getLevel()==1) { //����Ȯ��
			name =  c.getLv2Name(c.getPk()); //���� ��ȭ�̸� ����
		}
		if(c.getLevel()==2) {
			name =  c.getLv3Name(c.getPk());
		}
		c.setName(name);
		c.setLevel(c.getLevel()+1);
		System.out.println("���� �̸� : "+name +"\n ���� ���� : "+c.getLevel());
	}

	public void test() { /*-> ����ġ ��ȭ �޼ҵ� ����*/
		levelUp(pokemon);
	}
	
	public void gameOver() {
		/*
		 * HP or clean�� 0�� �Ǿ����� GameOver���
		 */
	}
	public void gameEnding() {
		/* �ִ����ġ�� �������� �� ���� ���� ��� */
	}
}

