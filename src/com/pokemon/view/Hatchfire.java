package com.pokemon.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Hatchfire extends JPanel{
	public Hatchfire() {
		Image icon = new ImageIcon("images/fire.gif").getImage().getScaledInstance(400, 400, 0);
		JLabel title = new JLabel(new ImageIcon(icon));
		this.add(title);
	}
}
