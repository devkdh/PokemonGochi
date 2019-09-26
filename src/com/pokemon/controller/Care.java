package com.pokemon.controller;

import java.util.Timer;
import java.util.TimerTask;

import com.pokemon.model.vo.Charac;


public class Care {
   public String status;
   
   Charac c = new Charac();
      
   public void eat() {                  //밥주기
      if(c.getHp()<100 && c.getHp()>0) {   //hp가 1이상 99이하일때
         c.setHp(c.getHp()+10);         //hp 10 증가
         c.setClean(c.getClean()-10);   //clean 10 감소
      }
   }
   
   public void ng() {                        //배변활동
      if(c.getClean()<100 && c.getClean()>0) {   //clean이 1이상 99이하일때         
         c.setClean(c.getClean()+10);         //clean 10 증가
         c.setHp(c.getHp()-10);               //hp 10 감소
      }
   }
   
   public void alertStatus() {      //9초 간격으로 랜덤으로 상태 출력
      if (c.getHp()<80 && c.getClean()<80) {      //체력과 청결도 모두 80보다 낮을때 실행됨   
         String[] statusMsg = {"","배고파요", "더러워요"}; 
         int ran = (int)(Math.random()*3);
         
         //카운트다운
         Timer timer = new Timer();
         TimerTask tTask = new TimerTask() {
            @Override
            public void run() {               
               System.out.println(statusMsg[(int)(Math.random()*2)+1]);
            }
         };      
         timer.schedule(tTask, 9000, 9000);   //9초간격으로 반복하여 타이머태스크 실행
      }
   }

}