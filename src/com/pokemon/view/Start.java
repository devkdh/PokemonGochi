package com.pokemon.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Start extends JPanel{
	public Start() {
		Image icon = new ImageIcon("images/logo.jpg").getImage().getScaledInstance(700, 350, 0);
		JLabel title = new JLabel(new ImageIcon(icon));
		this.add(title);
	}
}
