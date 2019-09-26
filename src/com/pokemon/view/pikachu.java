package com.pokemon.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class pikachu extends JPanel{
	public pikachu() {
		Image icon = new ImageIcon("images/Pikachuball.gif").getImage().getScaledInstance(400, 400, 0);
		JLabel title = new JLabel(new ImageIcon(icon));
		this.add(title);
	}
}

