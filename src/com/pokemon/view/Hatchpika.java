package com.pokemon.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Hatchpika extends JPanel{
	public Hatchpika() {
		Image icon = new ImageIcon("images/pika.gif").getImage().getScaledInstance(400, 400, 0);
		JLabel title = new JLabel(new ImageIcon(icon));
		this.add(title);
	}
}
