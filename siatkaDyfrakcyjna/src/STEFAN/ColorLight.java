package STEFAN;

import java.awt.Color;

import javax.swing.JOptionPane;

public class ColorLight {
	static Color currentColor;
	static int[] low = { 380, 430, 500, 520, 565, 590, 635, 750 }; // lista min wartosci
	static Color[] colors = { new Color(127, 0, 255), Color.blue, new Color(0, 255, 255), new Color(0, 255, 0),
			new Color(255, 200, 0), new Color(255, 131, 0), Color.red }; // konkretne kolory

	public static Color getColor(int wavelen) {

		for (int i = 0; i < low.length - 1; i++) {
			if (wavelen >= low[i] && wavelen < low[i + 1]) {
				currentColor = colors[i];
				break;
			}
		}
		return currentColor;
	}
}
