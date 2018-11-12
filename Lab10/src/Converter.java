// Name: Benjamin Bowser
// Instructor: Dr. Stephan
// CSE 271, Section A
// Date: April 12th, 2017
// Filename: Converter.java
// Description: Currency converter program to display
// different conversions of money.
package edu.miamioh.bowserbl;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author bowserbl
 *
 */
public class Converter extends JPanel  {

	private JTextField origin;
	private JTextField converted;
	private JButton calculate;
	private JComboBox starter;
	private JComboBox ender;
	private JLabel beginning;
	private JLabel ending;

	public Converter() {
		builder();
		panelAdd();
	}

	/**
	 * Builds new interactive objects and creates an ActionListener
	 */
	private void builder() {
		String[] options = { "US Dollars", "British Pounds", "Euros"};
		ActionListener listener = new ClickListener();
		origin = new JTextField(15);
		converted = new JTextField(15);
		calculate = new JButton("Convert");
		beginning = new JLabel("Starting Currency:");
		ending = new JLabel("Converted Currency:");
		starter = new JComboBox(options);
		ender = new JComboBox(options);
		actionAdder(listener);
	}

	/**
	 * Adds objects to the panel
	 */
	private void panelAdd() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,3));
		panel.add(beginning);
		panel.add(origin);
		panel.add(starter);
		panel.add(ending);
		panel.add(converted);
		panel.add(ender);
		panel.add(calculate);
		add(panel);
	}
	/**
	 * This method creates a new button, adds it to the panel, and also
	 * adds an actionListener to the button. This prevents the need for
	 * 3x more lines of code. 
	 *
	 * @param listener ActionListener object
	 */
	private void actionAdder(ActionListener listener) {
		origin.addActionListener(listener);
		converted.addActionListener(listener);
		calculate.addActionListener(listener);
		starter.addActionListener(listener);
		ender.addActionListener(listener);
	}

	class ClickListener implements ActionListener {
		DecimalFormat fmt = new DecimalFormat("###.##");
		// From: https://docs.oracle.com/javase/7/docs/api/java/text/DecimalFormat.html

		/**
		 * Checks the type of drop down box selection and handles the
		 * conversion accordingly. If the same currencies are selected
		 * display an error message.
		 * @param e ActionEvent object
		 */
		public void actionPerformed(ActionEvent e) {
			double input = 0, conversion = 0;
			input =	Double.parseDouble(origin.getText());
			
			if (starter.getSelectedIndex() == 0 && ender.getSelectedIndex() == 1) {
				conversion = input * 0.60975;
				// USD to PND
			}
			if (starter.getSelectedIndex() == 0 && ender.getSelectedIndex() == 2) {
				conversion = input * 0.60875;
				// USD to EUR
			}
			if (starter.getSelectedIndex() == 1 && ender.getSelectedIndex() == 0) {
				conversion = input * 1.64;
				// PND to USD
			}
			if (starter.getSelectedIndex() == 1 && ender.getSelectedIndex() == 2) {
				conversion = input * 1.13;
				// PND to EUR
			}
			if (starter.getSelectedIndex() == 2 && ender.getSelectedIndex() == 0) {
				conversion = input * 1.42;
				// EUR to USD
			}
			if (starter.getSelectedIndex() == 2 && ender.getSelectedIndex() == 1) {
				conversion = input * 0.88495;
			}
			if (starter.getSelectedIndex() == ender.getSelectedIndex()) {
				// Help from: http://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html
				JOptionPane.showMessageDialog(null,"Same currency selected.","Invalid Conversion",
						JOptionPane.ERROR_MESSAGE);
			}
			if (e.getSource() == calculate) {
				converted.setText(String.valueOf(fmt.format(conversion)));
			}
		}
	}
}