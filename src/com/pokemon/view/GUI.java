package com.pokemon.view;
import com.pokemon.model.vo.Charac;
import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
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
      //RED Button 이미지 씌우기
      Image redBtn = new ImageIcon("images/red.png").getImage();
      Image redBtn2 = redBtn.getScaledInstance(80, 80, 0);
      JButton red = new JButton(new ImageIcon(redBtn2));
      red.setBorderPainted(false);      //테두리없애기
      red.setContentAreaFilled(false);   //버튼 배경없애기
      
      //YELLOW Button
      Image yBtn = new ImageIcon("images/yellow.png").getImage();
      Image yBtn2 = yBtn.getScaledInstance(80, 80, 0);
      JButton yellow = new JButton(new ImageIcon(yBtn2));
      yellow.setBorderPainted(false);
      yellow.setContentAreaFilled(false);
      
      //GREEN Button
      Image gBtn = new ImageIcon("images/green.png").getImage();
      Image gBtn2 = gBtn.getScaledInstance(80, 80, 0);
      JButton green = new JButton(new ImageIcon(gBtn2));   
      green.setBorderPainted(false);
      green.setContentAreaFilled(false);
      
      btn.setLayout(new FlowLayout(FlowLayout.CENTER,50,30));   //버튼 패널 위치 및 간격 설정
      btn.add(red);
      btn.add(yellow);
      btn.add(green);
      
      ActionClass actionEvent = new ActionClass();
       red.addActionListener(actionEvent);    //빨간버튼 Actionevent
        yellow.addActionListener(actionEvent); //노랑버튼 Actionevent
        green.addActionListener(actionEvent); //초록버튼 Actionevent
        red.setActionCommand("1"); // 액션커맨드-빨강버튼의 숫자값을 정해줌
        yellow.setActionCommand("2");// 액션커맨드-노랑버튼의 숫자값을 정해줌
        green.setActionCommand("3");// 액션커맨드-초록버튼의 숫자값을 정해줌

      
      // btn panel add
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
            screen.add(eggbreak);   //알 부화화면 표시         
       }
    };      
    timer.schedule(tTask, 3000);
}
public void Hatchpika() {   //피카츄부화화면 표시
 
   System.out.println(pokemon.toString());
   System.out.println(pokemon.getName()+"가 태어났습니다!");
   eggbreak.setVisible(false); //알부화화면 삭제
   screen.add(Hatchpika);      //피카츄부화화면 표시
}
public void Hatchturtle() {   //꼬부기 부화화면 표시

   System.out.println(pokemon.toString());
   System.out.println(pokemon.getName()+"가 태어났습니다!");
   eggbreak.setVisible(false); //알부화화면 삭제
   screen.add(Hatchturtle);    //꼬부기 부화화면 표시   
}
public void Hatchfire() {   //파이리 부화화면 표시
   
   System.out.println(pokemon.toString());
   System.out.println(pokemon.getName()+"가 태어났습니다!");
   eggbreak.setVisible(false); //알부화화면 삭제
   screen.add(Hatchfire);      //파이리 부화화면 표시 
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
              case 1:      //빨간버튼       
                 if(i==1) {
                    Eggs();
                 }else if(i==2) {
                    eggbreak();
                 }else if (i==3&& k==0) { 
                    Hatchpika();                 
                 }else if (i==3 && k==1) {
                    Hatchturtle();
                 }else if (i==3 && k==2) {
                    Hatchfire();
                 }else if (i==4 && k==0 ) {
                    pikachu();   
                 }
                 i++;
                  break;
              case 2:      //노랑버튼
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
              case 3:      //초록버튼
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
