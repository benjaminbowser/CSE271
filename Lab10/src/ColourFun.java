// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: April 12th, 2017
// Filename: ColourFun.java
// Description: Class with a menu that allows swapping
// between Red, Green, and blue. Clicking panel changes
// to next color also.
package edu.miamioh.bowserbl;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JFrame;

/**
 * @author bowserbl
 *
 */
public class ColourFun extends JFrame {

	private JMenu menu;
	private JMenuBar topBar;
	private JPanel panel;

	public ColourFun() {
		panel = new JPanel();
		topBar = new JMenuBar();
		setJMenuBar(topBar);
		topBar.add(dropDown());
		panel.setBackground(Color.RED);
		panel.addMouseListener(listener);
		add(panel);
	}

	/**
    Creates the menu dropdown
    @return a menu
	 */
	private JMenu dropDown()
	{
		menu = new JMenu("Colour");
		menu.add(menuOption("Red"));
		menu.add(menuOption("Green"));
		menu.add(menuOption("Blue"));
		return menu;
	}

	/**
	 * Uses an ActionListener with an innerclass to determine
	 * which menu item was selected before calling another
	 * method to change the colors.
	 *
	 * @param name ActionListener object
	 * @return JMenuItem
	 */
	private JMenuItem menuOption(final String name)
	{
		class FaceItemListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				colorChanger(name);
			}
		}      
		JMenuItem item = new JMenuItem(name);      
		ActionListener listener = new FaceItemListener();
		item.addActionListener(listener);
		return item;
	}

	public class mouseListener implements MouseListener {
		/**
		 * Checks what the background is and changes it
		 * depending on what it was before the mouse
		 * was clicked.
		 * @param e MouseEvent object
		 */
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if (panel.getBackground() == Color.GREEN) {
				panel.setBackground(Color.BLUE);
			}
			else if (panel.getBackground() == Color.RED) {
				panel.setBackground(Color.GREEN);
			}
			else { 
				panel.setBackground(Color.RED);
			}
		}

		public void mousePressed(MouseEvent e) {}

		public void mouseReleased(MouseEvent e) {}

		public void mouseEntered(MouseEvent e) {}

		public void mouseExited(MouseEvent e) {}
	}
	MouseListener listener = new mouseListener();

	/**
	 * Changes the color of the background
	 *
	 * @param name String of the current color
	 */
	private void colorChanger(String name) {
		if (name == "Red") {
			panel.setBackground(Color.RED);
		}
		if (name == "Green") {
			panel.setBackground(Color.GREEN);
		}
		if (name == "Blue") {
			panel.setBackground(Color.BLUE);
		}
	}
}