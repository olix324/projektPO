package ModelBanabeau;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

public class Agent extends Rectangle {
	float strength;
	boolean isAgent;
	Color color;
	
	public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Agent(Dimension arg0, boolean isAgent) {
		super(arg0);
		this.isAgent = isAgent;
		if(isAgent) 
			color = Color.GREEN;
		else
			color = Color.WHITE;
		// TODO Auto-generated constructor stub
	}

	public Agent(int arg0, int arg1, int arg2, int arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

	public Agent(Point p, Dimension d) {
		super(p, d);
		// TODO Auto-generated constructor stub
	}
	
	public void drawAgent(Graphics g, Point startPoint) {
		//problem jest gdzie tu, z rysowanie
		// moze nie mozna tak przekazywac Graphics?
		g.setColor(color);
		g.fillRect(startPoint.x, startPoint.y, this.width, this.height);
	}

}
