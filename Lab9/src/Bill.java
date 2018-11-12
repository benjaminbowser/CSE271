// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: April 4th, 2017
// Filename: Bill.java
// Description: GUI of a menu builder
package edu.miamioh.bowserbl;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author bowserbl
 *
 */
public class Bill extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		frameBuilder();
		// Calls the frameBuilder

	}
	/**
	 * Builds the frame for the viewer and adds appropriate objects to the panel
	 * and frames. DecimalFormat was added to correctly format the price of
	 * the total bill to avoid additional decimal places.
	 */
	public static void frameBuilder() {
		DecimalFormat fmt = new DecimalFormat("###.##");
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setTitle("Bill");
		frame.setSize(620,300);

		JTextArea totals = new JTextArea(5, 40);
		JLabel name = new JLabel("Item Name:");
		JTextField nameBox = new JTextField(10); 
		JLabel price = new JLabel("Price:");
		JTextField priceBox = new JTextField(5);

		// New ClickListener with ActionListener added
		class ClickListener implements ActionListener {
			double total = 0;
			public void actionPerformed(ActionEvent e) {
				String name = "";
				double price = 0;
				if (e.getSource() instanceof JButton) {
					name = ((ButtonBuilder) e.getSource()).getName();
					price = ((ButtonBuilder) e.getSource()).getPrice();
					if (name == "Calculate") {
						double tax = total * 0.0675;
						totals.append("--------------\n");
						totals.append("Subtotal: $" + fmt.format(total) + "\n");
						totals.append("Taxes (6.75%): " + fmt.format(tax) + "\n");
						totals.append("Tip: $2\n");
						total = total + tax + 2;
						totals.append("Total: $" + fmt.format(total) + "\n");
						total = 0;
					}
					else if (name == "Add Item") {
						name = nameBox.getText();
						price = Double.parseDouble(priceBox.getText());
						totals.append(name + " $" + price + "\n");
						total = total + price;
					}
					else {
						totals.append(name + " $" + price + "\n");
						total = total + price;
					}

				}
			}
		}
		// Call constructor below
		ActionListener listener = new ClickListener();
		menuAdder("Grilled Cheese", 2.50, listener, panel);
		menuAdder("Hamburger", 3.50, listener, panel);
		menuAdder("Cheeseburger", 3.75, listener, panel);
		menuAdder("Turkey Club", 3.50, listener, panel);
		menuAdder("Ham Sandwhich", 2.75, listener, panel);
		menuAdder("Salad", 3.00, listener, panel);
		menuAdder("Steak", 4.50, listener, panel);
		menuAdder("Sweet Tea", 2.00, listener, panel);
		menuAdder("Diet Coke", 2.00, listener, panel);
		menuAdder("Coke", 2.00, listener, panel);

		panel.add(name);
		panel.add(nameBox);
		panel.add(price);
		panel.add(priceBox);
		menuAdder("Add Item", 0, listener, panel);
		panel.add(totals);
		menuAdder("Calculate", 0, listener, panel);

		frame.add(panel);
		frame.setVisible(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	/**
	 * This method creates a new button, adds it to the panel, and also
	 * adds an actionListener to the button. This prevents the need for
	 * 3x more lines of code. 
	 *
	 * @param  name A string of the button text
	 * @param  price The price of the menu item
	 * @param  listener ActionListener object for buttons
	 * @param  panel JPanel to add button to
	 */
	public static void menuAdder(String name, double price, ActionListener listener, JPanel panel) {
		ButtonBuilder button = new ButtonBuilder(name, price);
		panel.add(button);
		button.addActionListener(listener);
	}
}