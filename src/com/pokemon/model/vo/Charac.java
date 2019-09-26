package com.pokemon.model.vo;

public class Charac {
	
	private int pk;
	private String name; //캐릭터 이름
	private int hp; //캐릭터 HP
	private int clean; //캐릭터 청결
	private int exp; //경험치
	private int level; //캐릭터 레벨
	public static final int MAX_LEVEL=3; //캐릭터 최대 레벨
	/* 고유번호 상수 처리 */
	public static final int PIKA_NUM = 0;
	
	/* 레벨에 따른 이름 추가 */
	private String[] lv2 = {"피카츄","어니부기","리자드"};
	private String[] lv3 = {"라이츄","거북왕","리자몽"};
	
	//	private int kind;
//	private String[] kindName = {"피카츄","꼬부기","파이리"};
	
	public Charac() {}
	/* pokemon 새 생성자 */
	public Charac(int pk) {
		/* 공통값 */
		this.hp = 80;
		this.clean = 80;
		this.exp = 0;
		this.level = 1;
		
		/* 개별값 */
		this.pk = pk;
		switch(pk) {
		case 0: 
			this.name = "피츄";
			break;
		case 1:
			this.name = "꼬부기";
			break;
		case 2:
			this.name = "파이리";
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
	// 기존// 레벨에 따른 이름 변경 메소드
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