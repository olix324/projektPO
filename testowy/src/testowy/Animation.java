package testowy;


import java.awt.Graphics;
import java.awt.LinearGradientPaint;

import javax.swing.JPanel;

public class Animation extends JPanel{
	
		int n; // ilosc prazkow UZYTKOWNIK
		int d; // stala siatki UZYTKOWNIK
		int lambda; // dlugosc fali UZYTKOWNIK
		int y2tab []; // tablica wyliczonych polozen
		//int a; // odleglosc od przejscia do ekranu
		
		// definicja poczatku i konca
		int x_poczatek = 50;
		int y_poczatek = 260;
		int y_koniec = this.getHeight()/2;
		int x_koniec = this.getWidth()-50;
		int a = x_koniec - x_poczatek;
		int y; // polozenie konca poszczegolnego prazka
		
		
		double sinus = (n*lambda)/d; // wyznaczamy sinusa
		double tangens = sinus/(Math.sqrt(1-(sinus*sinus)));
		//y2tab = a*tangens+y1;
		//return (int)(tangens);
		
	public Animation() {
		// TODO Auto-generated constructor stub
		y2tab = new int [0];
	}
	
/*	public double roznica(int n, int d, int lambda)
	{
		double sinus = (n*lambda)/d; // wyznaczamy sinusa
		double tangens = sinus/(Math.sqrt(1-(sinus*sinus)));
		//y2tab = a*tangens+y1;
		return (int)(tangens);
	}*/
	
/*	public int countPlus(int x2, int nr) {
		 
		int y2 = (int)(-0.5*y1 + 0.5*Math.sqrt(y1*y1 - (x2-x1)*(x2-x1) + y1*y1 - a/(1- (nr*lambda)/d)*(nr*lambda)/d));
		System.out.println("TU PLUS y2 = " + y2);
		return y2;
		
	}
	public int countMinus(int x2, int nr) {
		 
		int y2 = (int)(-0.5*y1 - 0.5*Math.sqrt(y1*y1 - (x2-x1)*(x2-x1) + y1*y1 - a/(1- (nr*lambda)/d)*(nr*lambda)/d));
		System.out.println("TU MINUS y2 = " + y2);
		return y2;
		
	}*/
	
	public void startAnim(int n1, int d1, int lambda1) {
		
		/*this.n = n1; //to oznacza ¿e to z nawiasu jest tym co w klasie
		this.d = d1;
		this.lambda = lambda1;
		//System.out.println(lambda);
		x1 = 50;
		y1 = (int)(this.getHeight()/2);
		end = (int)(this.getWidth()-50);
		a = (int)(end - x1);
		*/
		y2tab = new int [2*n+1];
		
		//for(int x2 = x1; x2 < end; x2++) { // 
			//int numPrazek = 0;
			for(int i = 0; i < 2*n; i+=2) { // i<2*this.n
				
				y2tab[i] = (int) (a*tangens+y_koniec);
				y2tab[i+1] = (int) (y_koniec-a*tangens);
				//yend =(int)( y1 + y2tab[i]);
				
			//	y2tab[i] = (260-y2tab[i])+(y1+this.countPlus(x2, numPrazek));//*(numPrazek+1);
			//	y2tab[2*this.n-i] = (y1+this.countPlus(x2, numPrazek));//*(numPrazek+1);
			//	numPrazek += 1;
			//}
	//	y2tab[2*this.n] = y1;
	//	this.x2 = x2;
		
		System.out.println("x2 = " + Integer.toString(x_koniec));
		}
		
		//this.removeAll();
		// refresh the panel.
		//this.updateUI();
		this.repaint();
		}
		
	
	
	public void paintComponent(Graphics g) { // raczej dobre
		if(y2tab.length != 0)
		{
			g.drawLine(x_poczatek, y_poczatek, x_koniec, y_koniec);	
			for(double y_koniec : y2tab)
			{
				g.drawLine(x_poczatek, y_poczatek, x_koniec, y);	
				System.out.println(y_koniec);
			}
		}
		System.out.println("===============");
	}
}
