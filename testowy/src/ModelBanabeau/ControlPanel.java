package ModelBanabeau;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SpringLayout;

public class ControlPanel extends JPanel {
	Simulation sim;
	Parameters par;
	JSlider matrixSize;
	
	public ControlPanel(Dimension size){
		// TODO Auto-generated constructor stub
		this.setLayout(new SpringLayout());
		par = new Parameters();
		//par.setMatrixSize(10);
		sim = new Simulation(par, size);
		this.add(sim);
		
		//matrixSize = new JSlider(2, 100);
		//this.add(matrixSize);

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame mainFrame = new JFrame();
		mainFrame.setSize(500,500);
		mainFrame.add(new ControlPanel(new Dimension(500, 500)));
		mainFrame.setVisible(true);
	}

}
