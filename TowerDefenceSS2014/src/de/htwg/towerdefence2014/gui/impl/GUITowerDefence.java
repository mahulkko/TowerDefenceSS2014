package de.htwg.towerdefence2014.gui.impl;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUITowerDefence extends JFrame {
	
	public GUITowerDefence() {
		setTitle("TowerDefence2014");
	    setSize(800, 700);
	    setLocationRelativeTo(null);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    this.setVisible(true);
	    
	    Icon icon1 = new ImageIcon( "button.png" );

	    JButton button = new JButton();
	    button.setIcon( icon1 );
	   
	    JPanel panel = new JPanel();
	    getContentPane().add(panel);
	    panel.setLayout(null);
	    
	    button.setSize(100, 100);
	    panel.add(button);

	}
}
