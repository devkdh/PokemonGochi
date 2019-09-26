package com.pokemon.view;
import com.pokemon.model.vo.Charac;
import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class GUI extends JFrame{
	private static int k= (int)(Math.random()*3); //포켓몬종류가 안불러와지는 관계로 임시로 난수 지정
	
	Charac pokemon = new Charac(); 
	JPanel title = new JPanel();
	JPanel screen = new JPanel();
	JPanel chat = new JPanel();
	JPanel stat = new JPanel();
	JPanel btn= new JPanel();
	JPanel start = new Start();
	JPanel egg = new Egg();
	JPanel Hatchpika = new Hatchpika();
	JPanel Hatchturtle = new Hatchturtle();
	JPanel Hatchfire = new Hatchfire();
	JPanel pikachu = new pikachu();
	JPanel eggbreak = new eggbreak();
	
	public static void main(String[] args) {
		new GUI();
		System.out.println(k);
		
//		Charac c = new Charac();
//		Game g = new Game();
//		System.out.println(c.getPk());
//		System.out.println(g.getKind());
	}
	

	public GUI() {
		
		super("포켓몬GO치");
		
		this.setLayout(new BorderLayout());
		
		
		
		/* TITLE */
		title.setPreferredSize(new Dimension(0, 50));
		/* CHAT */
		chat.setPreferredSize(new Dimension(50, 0));
		/* STAT */
		stat.setPreferredSize(new Dimension(50, 0));
		
		/* BUTTONS */
		/* 여기서부터 */
		JButton red = new JButton("   ");
		JButton yellow = new JButton();
		JButton green = new JButton();		
		btn.setLayout(new GridLayout(1,3));
		JPanel a = new JPanel();
		JPanel b = new JPanel();
		JPanel c = new JPanel();
		
		a.setLayout(new BorderLayout());
		b.setLayout(new BorderLayout());
		c.setLayout(new BorderLayout());
		/* 잠깐 */
		JLabel q1 = new JLabel(" ");
		JLabel q2 = new JLabel(" ");
		JLabel q3 = new JLabel("                ");
		JLabel q4 = new JLabel("                ");
		
		JLabel q5 = new JLabel(" ");
		JLabel q6 = new JLabel(" ");
		JLabel q7 = new JLabel("                ");
		JLabel q8 = new JLabel("                ");
		
		JLabel q9 = new JLabel(" ");
		JLabel q10 = new JLabel(" ");
		JLabel q11 = new JLabel("                ");
		JLabel q12 = new JLabel("                ");
		
		btn.add(a);
		btn.add(b);
		btn.add(c);
		
		a.add(q1, "South");
		a.add(q2, "North");
		a.add(q3, "East");
		a.add(q4, "West");
		
		b.add(q5, "South");
		b.add(q6, "North");
		b.add(q7, "East");
		b.add(q8, "West");
		
		c.add(q9, "South");
		c.add(q10, "North");
		c.add(q11, "East");
		c.add(q12, "West");
		
		a.add(red,"Center");
		b.add(yellow,"Center");
		c.add(green, "Center");
		
		ActionClass actionEvent = new ActionClass();
	    red.addActionListener(actionEvent);    //빨간버튼 Actionevent
        yellow.addActionListener(actionEvent); //노랑버튼 Actionevent
        green.addActionListener(actionEvent); //초록버튼 Actionevent
        red.setActionCommand("1"); // 액션커맨드-빨강버튼의 숫자값을 정해줌
        yellow.setActionCommand("2");// 액션커맨드-노랑버튼의 숫자값을 정해줌
        green.setActionCommand("3");// 액션커맨드-초록버튼의 숫자값을 정해줌

		
        red.setBackground(Color.RED);
	     yellow.setBackground(Color.YELLOW);
	     green.setBackground(Color.GREEN);
		
		// btn panel add
		btn.setBackground(Color.blue);
		btn.setPreferredSize(new Dimension(0, 130));
		/* 여기까지 버튼 */
		
		/* 여기서부터 */
		screen.setLayout(new BorderLayout());
		
		/* screen 테두리 지정 */
		Border as = BorderFactory.createLineBorder(Color.black);
		screen.setBorder(as);
		screen.add(start);
		start.setVisible(true);

		/* 여기서까지 스크린 */
		
		// JFrame add
		this.add(title);
		this.add(screen);
		this.add(chat);
		this.add(stat);
		this.add(btn);
		
		this.add(btn, "South");
		this.add(title, "North");
		this.add(stat, "East");
		this.add(chat, "West");
		this.add(screen, "Center");
		

		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(300, 200, 900, 600);
	}

public void Eggs() {       //알 화면 표시
	start.setVisible(false); //시작화면 삭제
	screen.add(egg);   //알 화면 표시
}
public void eggbreak() {   //알 부화화면 표시
	Timer timer = new Timer();
    TimerTask tTask = new TimerTask() {
   	
       @Override
       public void run() {
				egg.setVisible(false); //알 화면 삭제
				screen.add(eggbreak);	//알 부화화면 표시			
       }
    };      
    timer.schedule(tTask, 3000);
}
public void Hatchpika() {   //피카츄부화화면 표시
 
	System.out.println(pokemon.toString());
	System.out.println(pokemon.getName()+"가 태어났습니다!");
	eggbreak.setVisible(false); //알부화화면 삭제
	screen.add(Hatchpika);		//피카츄부화화면 표시
}
public void Hatchturtle() {   //꼬부기 부화화면 표시

	System.out.println(pokemon.toString());
	System.out.println(pokemon.getName()+"가 태어났습니다!");
	eggbreak.setVisible(false); //알부화화면 삭제
	screen.add(Hatchturtle);	 //꼬부기 부화화면 표시	
}
public void Hatchfire() {   //파이리 부화화면 표시
	
	System.out.println(pokemon.toString());
	System.out.println(pokemon.getName()+"가 태어났습니다!");
	eggbreak.setVisible(false); //알부화화면 삭제
	screen.add(Hatchfire);		//파이리 부화화면 표시 
}

public void pikachu() {   //피카츄 플레이화면 표시
	Hatchpika.setVisible(false); //피카츄부화화면 삭제
	screen.add(pikachu);		
}
		class ActionClass implements ActionListener {
			int i=1;  //매 버튼 클릭시마다 1씩 증가
			
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        int action = Integer.parseInt(e.getActionCommand());
		        switch (action) { 
		        case 1:	   //빨간버튼    	
		        	if(i==1) {
		        		Eggs();
		        	}else if(i==2) {
		        		eggbreak();
		        	}else if (i==3&& k==0) { 
		        		Hatchpika();		        	
		        	}else if (i==3 && k==1) {
		        		Hatchturtle();
		        	}
		        	else if (i==3 && k==2) {
		        		Hatchfire();
		        	}else if (i==4 && k==0 ) {
		        		pikachu();	
		        	}
		        	i++;
		            break;
		        case 2:		//노랑버튼
		        	if(i==1) {
		        		Eggs();
		        	}else if(i==2) {
		        		eggbreak();
		        	}else if (i==3&& k==0) { 
		        		Hatchpika();		        	
		        	}else if (i==3 && k==1) {
		        		Hatchturtle();
		        	}
		        	else if (i==3 && k==2) {
		        		Hatchfire();
		        	}else if (i==4 && k==0 ) {
		        		pikachu();	
		        	}
		        	i++;
		            break;
		        case 3:		//초록버튼
		        	if(i==1) {
		        		Eggs();
		        	}else if(i==2) {
		        		eggbreak();
		        	}else if (i==3&& k==0) { 
		        		Hatchpika();		        	
		        	}else if (i==3 && k==1) {
		        		Hatchturtle();
		        	}
		        	else if (i==3 && k==2) {
		        		Hatchfire();
		        	}else if (i==4 && k==0 ) {
		        		pikachu();	
		        	}
		        	i++;
		            break;
		        default:
		            break;
		        }
		    }
		}
}
//JButton red, green;
//
//public void actionPerformed(ActionEvent e) {
//  Object src = e.getSource();
//
//  if (src == leftButton) {
//
//  }
//  else if (src == rightButton) {
//
//  }
//}
	


