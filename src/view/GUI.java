package view;

import java.awt.BorderLayout;
import java.util.Arrays;

import javax.swing.JFrame;

import model.Trenulet;

public class GUI extends JFrame {

	
	public Panza panza;
	
	
	public GUI( ){
	
		panza = new Panza();
		// acum panza are o referire catre toate trenuletele
		
		
		
		this.add(panza, BorderLayout.CENTER);
		
		this.setTitle("Trenulete");
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}
	
	
}
