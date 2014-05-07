package de.htwg.towerdefence2014.gui.impl;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUITowerDefence extends JFrame implements ActionListener, MouseListener{
	
	public class TransparentButton extends JButton {
		  public TransparentButton () {
		    super();
		    setBackground (new Color (255, 255, 255, 0));
		    setOpaque (false);
		  }
		}
	
	String resources = System.getProperty("user.dir") + "\\res\\";
	TransparentButton button;
	Icon icon1;
	Icon icon2;
	
	public GUITowerDefence() {
		setTitle("TowerDefence2014");
	    setSize(800, 700);
	    setLocationRelativeTo(null);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    //setUndecorated(true);						//Nice feature for startup
	    //this.setOpacity(0.5f);						//Nice feature for startup
	    setBackground(new Color(200,100,0));
	    this.setVisible(true);
	    
	    icon1 = new ImageIcon( resources + "button.png" );
	    icon2 = new ImageIcon( resources + "button2.png" );
	    
	    button = new TransparentButton();
	    button.setBorder(BorderFactory.createEmptyBorder());
	    button.setContentAreaFilled(false);
	    button.setIcon( icon1 );
	    button.addActionListener(this);
	    button.addMouseListener(this);
	    
	    JPanel panel = new JPanel();
	    getContentPane().add(panel);
	    panel.setLayout(null);
	    
	    button.setSize(304, 109);
	    panel.add(button);
	    validate();
	    System.out.println(resources + "button.png");
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == this.button){
            System.out.println("Button gedrueckt");
        }
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		button.setIcon( icon2 );
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		button.setIcon( icon1 );
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}




