package com.pokemon.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class eggbreak extends JPanel{
	public eggbreak() {
		Image icon = new ImageIcon("images/eggbreak.gif").getImage().getScaledInstance(400, 400, 0);
		JLabel title = new JLabel(new ImageIcon(icon));
		this.add(title);
	
	}
}