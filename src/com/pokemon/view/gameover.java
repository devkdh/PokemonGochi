package com.pokemon.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

	public class gameover extends JPanel{
		public gameover() {
			Image icon = new ImageIcon("images/gameover.gif").getImage().getScaledInstance(400, 400, 0);
			JLabel title = new JLabel(new ImageIcon(icon));
			this.add(title);
		}
	}


