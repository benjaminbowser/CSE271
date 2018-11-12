package edu.miamioh.bowserbl;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

/**
 * @author bowserbl
 *
 */
public class ChessPlace extends JButton {

	private static final long serialVersionUID = 1L;

	/**
	 * Creates a button of a chess board location
	 * @param color Designated color of the space
	 */
	public ChessPlace(Color color) {
		setBackground(color);
		setContentAreaFilled(false);
		setOpaque(true);
		setMargin(new Insets(0, 0, 0, 0));
		setFocusPainted(false);
		setBorder(new EmptyBorder(0, 0, 0, 0));
		setPreferredSize(new Dimension(50, 50));
	}

	/**
	 * Takes in an x or y coordinate from a JButton and resolves it in an
	 * easy to work with space number as seen on the board
	 * @param coord
	 * @return int of the resolved location
	 */
	public int resolveCoord(int coord) {
		int location;
		switch (coord) {
		case 0:  location = 0;
		break;
		case 50:  location = 1;
		break;
		case 100:  location = 2;
		break;
		case 150:  location = 3;
		break;
		case 200:  location = 4;
		break;
		case 250:  location = 5;
		break;
		case 300:  location = 6;
		break;
		case 350:  location = 7;
		break;
		default: location = -1;
		break;
		}
		return location;
	}
}