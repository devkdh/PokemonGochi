package com.pokemon.controller;

import java.util.Scanner;

import com.pokemon.model.vo.Charac;

public class Battle {
	
	Charac c = new Charac();

	int Enemyhp = (int)(Math.random()*45+30); //적 체력
	int EnemyAttack =(int)(Math.random()*10+15);//적 공격력
	int playerDamage = c.getLevel()*19;//레벨마다 공격력 19씩 증가
	int playerHp = 100;
	int playerExp = c.getExp();
	int penalty = c.getHp()-10;

	public void playersetAttack()  //플레이어 공격-적체력 감소
	{Enemyhp -=playerDamage;}
	public void enemysetDefense() //적 방어- 적 체력 0 감소
	{Enemyhp -= 0;}
	public void playersetDefense() // 플레이어 방어 - 플레이어 체력 0 감소
	{playerHp -= 0 ;}
	public void enemysetAttack() // 적 공격 (int)(Math.random()*10+10) 의 데미지
	{playerHp-=EnemyAttack;}

	public int enemygetAttack() //플레이어 공격받을시 플레이어 체력
	{   
	   System.out.println("플레이어의 전투력:"+playerHp);
	   return playerHp;}

	public int enemygetDefense() //적 방어시 적 체력
	{System.out.println("적전투력:"+Enemyhp);
	   return Enemyhp;}

	public int playergetAttack() //플레이어 공격시 적 체력
	{System.out.println("적전투력:"+Enemyhp);
	   return Enemyhp;}

	public int playergetDefense() //플레이어 방어시 플레이어 체력
	{System.out.println("플레이어의 전투력:"+playerHp);
	   return playerHp;
	}
	public int play() {
	   do {
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.println("적의 전투력"+Enemyhp);
	   System.out.println("플레이어의 전투력"+ playerHp);
	   System.out.println("\n버튼을 입력");
	   int i= sc.nextInt();
	   int ran = (int)(Math.random()*3+1);
	   switch(i) {
	   case 1: 
	   if(ran==1||ran==3) {
	      System.out.println("플레이어 공격");
	      System.out.println(playerDamage+"의 피해를 입혔다.");
	      playersetAttack();
	      playergetAttack();
	      System.out.println("적 공격");
	      System.out.println(EnemyAttack+"의 피해를 받았다.");
	      enemysetAttack();
	      enemygetAttack();
	   }else {
	      enemysetDefense();
	      enemygetDefense();
	      System.out.println("적이 방어성공");
	      System.out.println("적이 입은 피해 0");
	   }
	   break;
	   case 2:
	      if(ran==1||ran==3) {
	         playersetDefense();
	         playergetDefense();
	         System.out.println("플레이어가 방어성공");
	      }else {
	         System.out.println("서로 공격하지 않음");   
	      }
	      break;
	   case 3:
	      System.out.println("전투에서 도망, 도망 페널티 체력 10 감소");
	      System.out.println("플레이어 체력"+penalty);
	      playerHp = 100;
	      Enemyhp = (int)(Math.random()*45+30);
	      return penalty=c.getHp();
	   default:
	   }
	   }
	   while(Enemyhp>=1);
	   if(Enemyhp<1) {
	   System.out.println("전투에서 승리");
	   c.setExp(c.getExp()+50);
	   System.out.println("전투승리 경험치 50 획득");
	   System.out.println("현재경험치"+c.getExp());
	   playerHp = 100;
	   Enemyhp = (int)(Math.random()*45+30);
	   }
	   return playerExp=c.getExp();
	}


}
