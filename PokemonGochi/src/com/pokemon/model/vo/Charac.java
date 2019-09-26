package com.pokemon.model.vo;

public class Charac {
	
	private int pk;
	private String name; //ĳ���� �̸�
	private int hp; //ĳ���� HP
	private int clean; //ĳ���� û��
	private int exp; //����ġ
	private int level; //ĳ���� ����
	public static final int MAX_LEVEL=3; //ĳ���� �ִ� ����
	/* ������ȣ ��� ó�� */
	public static final int PIKA_NUM = 0;
	
	/* ������ ���� �̸� �߰� */
	private String[] lv2 = {"��ī��","��Ϻα�","���ڵ�"};
	private String[] lv3 = {"������","�źϿ�","���ڸ�"};
	
	//	private int kind;
//	private String[] kindName = {"��ī��","���α�","���̸�"};
	
	public Charac() {}
	/* pokemon �� ������ */
	public Charac(int pk) {
		/* ���밪 */
		this.hp = 80;
		this.clean = 80;
		this.exp = 0;
		this.level = 1;
		
		/* ������ */
		this.pk = pk;
		switch(pk) {
		case 0: 
			this.name = "����";
			break;
		case 1:
			this.name = "���α�";
			break;
		case 2:
			this.name = "���̸�";
			break;
		}
	}
	public Charac(int pk, String name, int hp, int clean, int exp, int level) {
		
		this.pk = pk;
		this.name = name;
		this.hp = hp;
		this.clean = clean;
		this.exp = exp;
		this.level = level;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHp() {
		return hp;
	}
	
	public void setHp(int hp) {
		
		if(hp>=0 && hp<=100) {
			this.hp = hp;
		}
	}
	
	public int getPk() {
		return pk;
	}
	public void setPk(int pk) {
		this.pk = pk;
	}
	
	public int getClean() {
		return clean;
	}
	
	public void setClean(int clean) {
		
		if(clean>=0 && clean<=100) {
			this.clean = clean;
		}
	}
	
	public int getExp() {
		return exp;
	}
	
	public void setExp(int exp) {
		
		if(exp>=0 && exp<=100) {
			this.exp = exp;
		}
	}
	
	public int getLevel() {
		return level;
	}
	
	public void setLevel(int level) {
		
		if(level<=MAX_LEVEL) {
			this.level = level;
		}
	}
	// ����// ������ ���� �̸� ���� �޼ҵ�
	public String getLv2Name(int pk) {
		return lv2[pk];
	}
	public String getLv3Name(int pk) {
		return lv3[pk];
	}
	@Override
	public String toString() {
		return "Character [pk=" + pk + ", name=" + name + ", hp=" + hp + ", clean=" + clean + ", exp=" + exp
				+ ", level=" + level + "]";
	}
	
}