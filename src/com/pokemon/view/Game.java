package com.pokemon.view;

import java.util.Timer;
import java.util.TimerTask;

import com.pokemon.model.vo.Charac;


public class Game {
	private int kind = (int)(Math.random()*3); //포켓몬의 종류 랜덤
	
	public int getKind() {
		return kind;
	}

	public void setKind(int kind) {
		this.kind = kind;
	}
	Charac pokemon = new Charac(kind); //캐릭터로 보내기

	/* 게임 start버튼 클릭 후, 캐릭터 등장전까지 대기시간 소요 */ 
	public void hatch() {
		//카운트다운
        Timer timer = new Timer();
        TimerTask tTask = new TimerTask() {
           @Override
           public void run() {
				System.out.println(pokemon.toString());
				System.out.println(pokemon.getName()+"가 태어났습니다!");
           }
        };      
        timer.schedule(tTask, 3000);	
	}

	/* 경험치가 100이 되었을때 level&name 값 변경 */
	public void levelUp(Charac c) {
		String name = "";
		if(c.getLevel()==1) { //레벨확인
			name =  c.getLv2Name(c.getPk()); //다음 진화이름 설정
		}
		if(c.getLevel()==2) {
			name =  c.getLv3Name(c.getPk());
		}
		c.setName(name);
		c.setLevel(c.getLevel()+1);
		System.out.println("다음 이름 : "+name +"\n 다음 레벨 : "+c.getLevel());
	}

	public void test() { /*-> 경험치 변화 메소드 예시*/
		levelUp(pokemon);
	}
	
	public void gameOver() {
		/*
		 * HP or clean이 0이 되었을때 GameOver출력
		 */
	}
	public void gameEnding() {
		/* 최대경험치에 도달했을 때 게임 엔딩 출력 */
	}
}

