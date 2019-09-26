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
	private static int k= (int)(Math.random()*3); //���ϸ������� �Ⱥҷ������� ����� �ӽ÷� ���� ����
	
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
		
		super("���ϸ�GOġ");
		
		this.setLayout(new BorderLayout());
		
		
		
		/* TITLE */
		title.setPreferredSize(new Dimension(0, 50));
		/* CHAT */
		chat.setPreferredSize(new Dimension(50, 0));
		/* STAT */
		stat.setPreferredSize(new Dimension(50, 0));
		
		/* BUTTONS */
		/* ���⼭���� */
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
		/* ��� */
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
	    red.addActionListener(actionEvent);    //������ư Actionevent
        yellow.addActionListener(actionEvent); //�����ư Actionevent
        green.addActionListener(actionEvent); //�ʷϹ�ư Actionevent
        red.setActionCommand("1"); // �׼�Ŀ�ǵ�-������ư�� ���ڰ��� ������
        yellow.setActionCommand("2");// �׼�Ŀ�ǵ�-�����ư�� ���ڰ��� ������
        green.setActionCommand("3");// �׼�Ŀ�ǵ�-�ʷϹ�ư�� ���ڰ��� ������

		
        red.setBackground(Color.RED);
	     yellow.setBackground(Color.YELLOW);
	     green.setBackground(Color.GREEN);
		
		// btn panel add
		btn.setBackground(Color.blue);
		btn.setPreferredSize(new Dimension(0, 130));
		/* ������� ��ư */
		
		/* ���⼭���� */
		screen.setLayout(new BorderLayout());
		
		/* screen �׵θ� ���� */
		Border as = BorderFactory.createLineBorder(Color.black);
		screen.setBorder(as);
		screen.add(start);
		start.setVisible(true);

		/* ���⼭���� ��ũ�� */
		
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

public void Eggs() {       //�� ȭ�� ǥ��
	start.setVisible(false); //����ȭ�� ����
	screen.add(egg);   //�� ȭ�� ǥ��
}
public void eggbreak() {   //�� ��ȭȭ�� ǥ��
	Timer timer = new Timer();
    TimerTask tTask = new TimerTask() {
   	
       @Override
       public void run() {
				egg.setVisible(false); //�� ȭ�� ����
				screen.add(eggbreak);	//�� ��ȭȭ�� ǥ��			
       }
    };      
    timer.schedule(tTask, 3000);
}
public void Hatchpika() {   //��ī���ȭȭ�� ǥ��
 
	System.out.println(pokemon.toString());
	System.out.println(pokemon.getName()+"�� �¾���ϴ�!");
	eggbreak.setVisible(false); //�˺�ȭȭ�� ����
	screen.add(Hatchpika);		//��ī���ȭȭ�� ǥ��
}
public void Hatchturtle() {   //���α� ��ȭȭ�� ǥ��

	System.out.println(pokemon.toString());
	System.out.println(pokemon.getName()+"�� �¾���ϴ�!");
	eggbreak.setVisible(false); //�˺�ȭȭ�� ����
	screen.add(Hatchturtle);	 //���α� ��ȭȭ�� ǥ��	
}
public void Hatchfire() {   //���̸� ��ȭȭ�� ǥ��
	
	System.out.println(pokemon.toString());
	System.out.println(pokemon.getName()+"�� �¾���ϴ�!");
	eggbreak.setVisible(false); //�˺�ȭȭ�� ����
	screen.add(Hatchfire);		//���̸� ��ȭȭ�� ǥ�� 
}

public void pikachu() {   //��ī�� �÷���ȭ�� ǥ��
	Hatchpika.setVisible(false); //��ī���ȭȭ�� ����
	screen.add(pikachu);		
}
		class ActionClass implements ActionListener {
			int i=1;  //�� ��ư Ŭ���ø��� 1�� ����
			
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        int action = Integer.parseInt(e.getActionCommand());
		        switch (action) { 
		        case 1:	   //������ư    	
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
		        case 2:		//�����ư
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
		        case 3:		//�ʷϹ�ư
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
	


