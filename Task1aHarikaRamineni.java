package com.finalproject.java;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Task1aHarikaRamineni extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		Task1aHarikaRamineni frame = new Task1aHarikaRamineni();
		frame.setVisible(true);

	}

	/**
	 * Create the frame.
	 */
	public Task1aHarikaRamineni() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
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
}
