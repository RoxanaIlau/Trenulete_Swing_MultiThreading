package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import model.Principala;

public class Panza extends JPanel {

	private boolean flag = true;;
	
	public Panza(){
		
		this.setSize(800, 600);
	}
	
	@Override
	public void paint(Graphics g) {
		
		deseneazaInfrastructura(g);
		
		g.setColor(Color.GREEN);
		g.fillRect(Principala.trenulete[0].getPozitie(), 
				Principala.trenulete[0].getPozitieY(), 100, 30);
		
		g.setColor(Color.YELLOW);
		g.fillRect(Principala.trenulete[1].getPozitie(), 
				Principala.trenulete[1].getPozitieY(), 100, 30);
		
		g.setColor(Color.RED);
		g.fillRect(Principala.trenulete[2].getPozitie(), 
				Principala.trenulete[2].getPozitieY(), 100, 30);
		
		g.setColor(Color.BLUE);
		g.fillRect(Principala.trenulete[3].getPozitie(), 
				Principala.trenulete[3].getPozitieY(), 100, 30);
		
		g.setColor(Color.MAGENTA);
		g.fillRect(Principala.trenulete[4].getPozitie(), 
				Principala.trenulete[4].getPozitieY(), 100, 30);
		
	}
	
	public void stergeDesenul(Graphics gr){
		super.paint(gr);
	}
	
	private void deseneazaInfrastructura(Graphics g){
		
		g.setColor(Color.BLACK);
		
		for (int i = 0; i < 5; i++) {
			g.drawLine(0, i*100 + 15, 450, i*100 + 15);
			g.drawLine(0, i*100 + 35, 450, i*100 + 35);
		}
		
		// sinele de la Gara
		g.drawLine(500, 215, 800, 215);
		g.drawLine(500, 235, 800, 235);
	
		g.setColor(Color.PINK);
		g.fillRect(550, 150, 100, 50);
		
		g.setColor(Color.BLACK);
		g.drawString("G A R A", 570, 160);
		
		// semanfor
		g.drawRect(500, 160, 20, 40);
		
		if (flag){
			g.setColor(Color.GREEN);
			g.fillOval(500, 180, 20, 20);
		} else {			
			g.setColor(Color.RED);
			g.fillOval(500, 160, 20, 20);
		}
		
	}

	public void seteazaSemafor(boolean flag) {
		this.flag = flag;
	}
	
	
	
	
}







