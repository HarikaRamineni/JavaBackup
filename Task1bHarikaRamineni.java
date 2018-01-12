package com.finalproject.java;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Task1bHarikaRamineni extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JMenuBar  menubar;
	private JMenu  color;
	private JMenuItem  red;
	private JMenuItem  blue;
	private JMenuItem  green;
	private JMenuItem  yellow;
	private JMenuItem  black;
	private JMenuItem  pink;
	private JMenuItem  cyan;
	private JMenuItem  magenta;
	private JMenuItem  darkgray;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		Task1bHarikaRamineni frame = new Task1bHarikaRamineni();
		frame.setVisible(true);

	}

	/**
	 * Create the frame.
	 */
	public Task1bHarikaRamineni() {
		
		setTitle(" HOUSE ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//menubar
		 menubar = new JMenuBar();
		 //menu
		 color =  new JMenu("Color");
		 
		 //menuitem
		 red = new JMenuItem("Red");
		 red.addActionListener(this);
		 blue = new JMenuItem("Blue");
		 blue.addActionListener(this);
		 green = new JMenuItem("Green");
		 green.addActionListener(this);
		 yellow = new JMenuItem("Yellow");
		 yellow.addActionListener(this);
		 black = new JMenuItem("Black");
		 black.addActionListener(this);
		 pink = new JMenuItem("Pink");
		 pink.addActionListener(this);
		 cyan = new JMenuItem("Cyan");
		 cyan.addActionListener(this);
		 magenta = new JMenuItem("Magenta");
		 magenta.addActionListener(this);
		 darkgray = new JMenuItem("DarkGray");
		 darkgray.addActionListener(this);
		 
		 //register menuItems to menu
		 color.add(red);
		 color.add(blue);
		 color.add(green);
		 color.add(yellow);
		 color.add(black);
		 color.add(pink);
		 color.add(cyan);
		 color.add(magenta);
		 color.add(darkgray);

		 // register color menu in menubar
		 menubar.add(color);
		 //set menubar
		 setJMenuBar(menubar);
		 
		
	}

//paint method
	public void paint(Graphics g){
		  super.paint(g);
		  g.setColor(Color.BLACK);
          g.drawLine(300, 600, 300, 900); // left line
          g.drawLine(600, 580, 600, 950); //right line
          g.drawLine(300, 900, 600, 950);//bottom
          g.drawLine(250, 650, 450, 450); //cross1 /
          g.drawLine(450, 450, 650, 625); //cross2 \ 
          g.drawLine(600,950, 1000, 830);//right bottom
          g.drawLine(1000,830, 1000, 530);//right pole from bottom
          g.drawLine(450,450, 980, 330);// top line roof
          g.drawLine(650,625, 1100, 500);//roof bottom line
          g.drawLine(980,330, 1100, 500);//roof right line
          g.drawLine(750,685, 850, 660); //window middle line
          g.drawLine(750,645, 850, 620);//window above line
          g.drawLine(750,725, 850, 700);//window below line
          g.drawLine(750,725, 750, 645);//merge window left line
          g.drawLine(850,700, 850, 620); //merge window right line
          g.drawLine(800,715, 800, 630); //window center line
          g.drawLine(405,915, 405, 730); //main door left line
          g.drawLine(465,925, 465, 730); //main door right line
          g.drawLine(405,730, 465, 730); //main door top  line
          g.drawLine(405,915, 325, 950); //shadow left line
          g.drawLine(465,925, 400, 960); //shadow right line
          g.drawLine(700,350, 700, 450); // roof straight left line
          g.drawLine(750,330, 750, 420);//roof straight right line
          g.drawLine(700,350, 750, 330);//roof top line
          g.drawOval(800, 320, 80, 85);//draw circle
          g.drawLine(840,360, 900, 300);//line1 inside circle
          g.drawLine(840,360, 840, 430);//line2 inside circle
          g.drawOval(420, 600, 40, 50);;//circle inside main entrance
          
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==red){
		  this.getContentPane().setBackground(Color.RED);
	     // red.setBackground(Color.red);
		}
		
		if(arg0.getSource()==blue){
			  this.getContentPane().setBackground(Color.BLUE);
	//	      red.setBackground(Color.blue);
			}
		
		if(arg0.getSource()==green){
			  this.getContentPane().setBackground(Color.GREEN);
		      red.setBackground(Color.green);
			}
		
		if(arg0.getSource()==yellow){
			  this.getContentPane().setBackground(Color.YELLOW);
		      red.setBackground(Color.yellow);
			}
		
		if(arg0.getSource()==black){
			  this.getContentPane().setBackground(Color.BLACK);
		      red.setBackground(Color.black);
			}
		
		if(arg0.getSource()==pink){
			  this.getContentPane().setBackground(Color.PINK);
		      red.setBackground(Color.pink);
			}
		
		if(arg0.getSource()==cyan){
			  this.getContentPane().setBackground(Color.CYAN);
		      red.setBackground(Color.cyan);
			}
		
		if(arg0.getSource()==magenta){
			  this.getContentPane().setBackground(Color.MAGENTA);
		      red.setBackground(Color.magenta);
			}
		
		if(arg0.getSource()==darkgray){
			  this.getContentPane().setBackground(Color.DARK_GRAY);
		      red.setBackground(Color.darkGray);
			}
		
	}
}
