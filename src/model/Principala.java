package model;

import java.awt.EventQueue;
import java.util.Arrays;

import view.GUI;

public class Principala {

	
	public static GUI gui;
	public static Trenulet[] trenulete;
	
	
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable(){

			@Override
			public void run() {
				
				// cream mai intai trenuletele pentru ca 
				// atunci cand vom crea GUI-ul, 
				// metoda paint() din Panza sa isi poata lua
				// pozitiile trenuletelor din Trenulete.
			
				trenulete = new Trenulet[5];
				
				for (int i = 0; i < 5; i++) {
					
					trenulete[i] = new Trenulet( i*100 + 10 );
				
				}
				
				
				// cream GUI-ul
			
				gui = new GUI();
				
				
				// De abia acum dam drumul la Threaduri
				for (Trenulet trenulet : trenulete) {
					
					trenulet.start();
				
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
			
			
			
		});
		
	}
	
}
