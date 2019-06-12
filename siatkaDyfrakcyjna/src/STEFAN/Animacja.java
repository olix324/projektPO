package STEFAN;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.LinearGradientPaint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Animacja extends JPanel implements ActionListener {

	int n;// to nie s¹ te same co w nawiasie
	int d;
	int lambda;
	int y2tab[];
	int a;
	int y1;
	int x1;
	int x2;
	int end;
	double sinus;
	double tangens;
	Timer timer;

	public Animacja() {
		// TODO Auto-generated constructor stub
		y2tab = new int[0];
	}

	/*
	 * public int countPlus(int x2, int nr) {
	 * 
	 * int y2 = (int) (-0.5 * y1 + 0.5 * Math .sqrt(y1 * y1 - (x2 - x1) * (x2 - x1)
	 * + y1 * y1 - a / (1 - (nr * lambda) / d) * (nr * lambda) / d));
	 * 
	 * return y2;
	 * 
	 * }
	 * 
	 * public int countMinus(int x2, int nr) {
	 * 
	 * int y2 = (int) (-0.5 * y1 - 0.5 * Math .sqrt(y1 * y1 - (x2 - x1) * (x2 - x1)
	 * + y1 * y1 - a / (1 - (nr * lambda) / d) * (nr * lambda) / d));
	 * 
	 * return y2;
	 * 
	 * }
	 */

	public void startAnim(int n1, int d1, int lambda1) {

		this.n = n1; // to oznacza ¿e to z nawiasu jest tym co w klasie
		this.d = d1;
		this.lambda = lambda1;

		this.sinus = (double) (n1 * lambda1) / d1;
		this.tangens = (double) sinus / (Math.sqrt(1 - (sinus * sinus)));

		this.repaint(); // System.out.println(lambda);
		this.x1 = 50;
		this.x2 = x1;
		this.y1 = (int) (this.getHeight() / 2);
		end = (int) (this.getWidth() - 50);
		a = (int) (end - x1);

		this.y2tab = new int[2 * n + 1];

		timer = new Timer(20, this);
		timer.setInitialDelay(900);
		timer.start();

		/*
		 * for(int x2 = x1; x2 < end; x2++) { int numPrazek = 0; for(int i = 0; i <
		 * 2*this.n; i+=2) {
		 * 
		 * y2tab[i] = (y1+this.countPlus(x2, numPrazek))*(numPrazek+1); y2tab[i+1] =
		 * (y1+this.countMinus(x2, numPrazek))*(numPrazek+1); numPrazek += 1; //}
		 * y2tab[2*this.n] = y1; this.x2 = x2;
		 * 
		 * System.out.println("x2 = " + Integer.toString(x2)); }
		 * 
		 * this.removeAll(); // refresh the panel. //this.updateUI(); this.repaint(); }
		 */

	}

	private void step() {
		int numPrazek = 1;
		System.out.println("x2=" + Integer.toString(x2));
		for (int i = 0; i < 2 * this.n; i += 2) {
			this.sinus = (double) (numPrazek * lambda) / d;
			this.tangens = (double) sinus / (Math.sqrt(1 - (sinus * sinus)));
			y2tab[i] = (int) (y1 - (x2 - x1) * tangens);
			y2tab[i + 1] = (int) (y1 + (x2 - x1) * tangens);
			numPrazek++;
		}
		y2tab[2 * this.n] = y1;
		this.x2++;
	}

	public void paintComponent(Graphics g) {
		this.removeAll();
		g.setColor(Color.gray);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.setColor(ColorLight.getColor(lambda));
		if (y2tab.length != 0) {
			for (int y2 : y2tab) {
				g.drawLine(x1, y1, x2, y2);
				System.out.println(y2);
			}
		}
		System.out.println("===============");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (this.x2 < this.end) {
			this.step();
			repaint();
		}
	}
}
