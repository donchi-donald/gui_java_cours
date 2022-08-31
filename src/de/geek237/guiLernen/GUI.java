package de.geek237.guiLernen;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame{
	
	private Container container;
	private JLabel labelCenter = new JLabel("Center", JLabel.CENTER);
	private JLabel labelNorth = new JLabel("North", JLabel.CENTER);
	private JLabel labelSouth = new JLabel("South", JLabel.CENTER);
	private JLabel labelWest= new JLabel("West", JLabel.CENTER);
	private JLabel labelEast = new JLabel("East", JLabel.CENTER);
	private JLabel labelNom = new JLabel("Nom: ");
	private JLabel labelAge = new JLabel("Age: ");
	private JTextField textFielage = new JTextField();
	private JTextField textFielnom = new JTextField();
	
	
	
	private JPanel panel1 = new JPanel();
	
	public GUI() {
		
		panel1.setLayout(new GridLayout(2, 2));
		panel1.add(labelNom); panel1.add(textFielnom);
		panel1.add(labelAge); panel1.add(textFielage);
		
		container = this.getContentPane();//contenue de la fenetre actuel
		container.setLayout(new BorderLayout());//je veux aligner les éléments de ma fénètre principale selon le principe des Borderlayouts
		container.add(panel1, BorderLayout.NORTH);
		container.add(labelSouth, BorderLayout.SOUTH);
		container.add(labelCenter, BorderLayout.CENTER);
		container.add(labelWest, BorderLayout.WEST);
		container.add(labelEast, BorderLayout.EAST);
		
		
		
		//super();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Mein erstes Fenster");
		this.setSize(500, 500);
		this.setVisible(true);
	}
	
}
