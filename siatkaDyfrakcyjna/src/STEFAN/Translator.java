package STEFAN;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;

public class Translator {
	
	static String Par;
	
	final static ArrayList<ComponentLabel> componentArray = new ArrayList<ComponentLabel>();
	static Locale locale = new Locale(Par.lang);
	static ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale);
	
	static void add(Component component, String label) {
		componentArray.add(new ComponentLabel(component, label));
	}
	
	
	static void setLang(String lang) {
		locale = new Locale(lang);
		ResourceBundle.clearCache();
		messages = ResourceBundle.getBundle("MessagesBundle", locale);
		refresh();
	}
	
	private static void refresh() {
		for(ComponentLabel comp : componentArray) {
			comp.setText(ResourceBundle.getBundle("MessagesBundle", locale));
		}
	}
	
	public static String getString(String key) {
		return(messages.getString(key));
	}
}
