package ModelBanabeau;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.Random;

import javax.swing.JPanel;

public class Simulation extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2608423877587545083L;
	Parameters par;
	Agent [][] agentsList;
	
	Random rand = new Random();
	
	public Simulation(Parameters par, Dimension size) {
		super();
		this.par = par;
		this.setSize(size);
		agentsList = new Agent[par.getMatrixSize()][par.getMatrixSize()];
		int widthAgent = (int) this.getWidth()/par.getMatrixSize();
		int heightAgent =(int) this.getHeight()/par.getMatrixSize();
		Dimension agentSize = new Dimension(widthAgent, heightAgent);
		for(int xx = 0; xx < par.getMatrixSize(); xx++){
			for(int yy = 0; yy < par.getMatrixSize(); yy++) {
				if(par.getRo() <= rand.nextDouble()) {
				agentsList[xx][yy] = new Agent(agentSize, true);
				}else {
				agentsList[xx][yy] = new Agent(agentSize, false);
				}
			}
		}
		// TODO Auto-generated constructor stub
	}
	
//	protected void paintComponent(Graphics g) {
//		super.paintComponent(g);
//		Graphics2D g2d = (Graphics2D) g;
////		int widthAgent = (int) this.getWidth()/par.getMatrixSize();
////		int heightAgent =(int) this.getHeight()/par.getMatrixSize();
////		Point startPoint;
////		for(int xx = 0; xx < par.getMatrixSize(); xx++){
////			for(int yy = 0; yy < par.getMatrixSize(); yy++) {
////				System.out.println("Rysuje agenta");
////				startPoint = new Point(xx*widthAgent, yy*heightAgent);
////				int test = (int) agentsList[xx][yy].getWidth();
////				//g.drawRect(startPoint.x, startPoint.y,(int) agentsList[xx][yy].getWidth(),(int) agentsList[xx][yy].getHeight());
////				//g.drawRect(xx*widthAgent, yy*heightAgent,(int) agentsList[xx][yy].getWidth(),(int) agentsList[xx][yy].getHeight());
////			}
////		}
//		//System.out.println("Rysuje agenta");
//		g2d.setColor(Color.black);
//		g2d.drawLine(100,100,300,300);
//	}
	
    @Override public void paintComponent(Graphics g) {
    	super.paintComponent(g);
        g.drawOval(50, 50, 50, 50); // <-- draws an oval on the panel
        System.out.println("Dwa");
    }
	
	public Parameters getPar() {
		return par;
	}
	public void setPar(Parameters par) {
		this.par = par;
	}
	
}
