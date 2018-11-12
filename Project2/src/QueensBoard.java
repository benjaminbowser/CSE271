package edu.miamioh.bowserbl;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 * @author bowserbl
 *
 */
public class QueensBoard extends JPanel {

	private static final long serialVersionUID = 1L;

	private JPanel panel;
	private JPanel innerPanel;
	private JPanel buttonArea;
	private boolean board[][];
	private JButton boardButton[][];
	private ActionListener listen;
	private JButton safe;
	private JButton tipBasic;
	private JButton tipAdvance;
	private int queensActive = 0;

	/**
	 * Create a new QueensBoard
	 */
	public QueensBoard() {
		listen = new ClickListener();
		outterBuilder();
		buttonArea();
		spaceNumbers();
		buttonGen();
	}

	/**
	 * Generates JPanels and 3 button used to check solution. Actionlisteners
	 * are added in this step.
	 */
	private void buttonArea() {
		buttonArea = new JPanel();
		buttonArea.setLayout(new BorderLayout());
		safe = new JButton("Check If Safe");
		tipBasic = new JButton("Tip");
		tipAdvance = new JButton("Smart Tip");
		buttonArea.add(tipBasic, BorderLayout.NORTH);
		buttonArea.add(safe,BorderLayout.CENTER);
		buttonArea.add(tipAdvance, BorderLayout.SOUTH);
		panel.add(buttonArea, BorderLayout.WEST);
		add(buttonArea);
		safe.addActionListener(listen);
		tipBasic.addActionListener(listen);
		tipAdvance.addActionListener(listen);
	}

	/**
	 * Creates a JPanel to place all items inside of.
	 */
	private void outterBuilder() {
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		add(panel);
	}

	/**
	 * Creates the numbers on the horizontal and vertical axis on the side and
	 * top of the board.
	 */
	private void spaceNumbers() {
		JPanel horzLabels = new JPanel(new GridLayout(1,8));
		JPanel vertLabels = new JPanel(new GridLayout(8,1));

		for (int i = 0; i < 8; i++) {
			JLabel label = new JLabel("    " + i);
			horzLabels.add(label);
		}

		for (int i = 0; i < 8; i++) {
			JLabel label = new JLabel(i + " ");
			vertLabels.add(label);
		}
		panel.add(vertLabels, BorderLayout.WEST);
		panel.add(horzLabels, BorderLayout.NORTH);
		add(panel);
	}

	/**
	 * Generates the board using multiple for loops and ChessPlace objects.
	 */
	private void buttonGen() {
		/*
		 * Assistance used from the following:
		 * http://stackoverflow.com/questions/13355337/how-can-i-make-a-jbutton-fill-a-jpanel-so-that-there-is-no-space-between-buttons
		 * http://stackoverflow.com/questions/18165160/setting-background-color-to-jbutton
		 * http://stackoverflow.com/questions/2536873/how-can-i-set-size-of-a-button
		 */
		board = new boolean[8][8];
		boardButton = new JButton[8][8];
		innerPanel = new JPanel(new GridLayout(8,8));

		for (int i = 0; i < 8; i ++) {
			for (int j = 0; j < 8; j ++) {
				if ((i + j + 1) % 2 == 0) {
					ChessPlace buttonWhite = new ChessPlace(Color.WHITE);
					boardButton[i][j] = buttonWhite;
					innerPanel.add(buttonWhite);
					buttonWhite.addActionListener(listen);
				}
				else {
					ChessPlace buttonBlack = new ChessPlace(Color.BLACK);
					boardButton[i][j] = buttonBlack;
					innerPanel.add(buttonBlack);
					buttonBlack.addActionListener(listen);
				}
			} 
		}
		panel.add(innerPanel, BorderLayout.CENTER);	
	}

	/**
	 * @author bowserbl
	 *
	 */
	class ClickListener implements ActionListener {

		String name;
		ValidCheck verify = new ValidCheck();

		public void actionPerformed(ActionEvent e) {

			ImageIcon queen = new ImageIcon(getClass().getResource("queensmall.png"));
			// Image from: http://www.clipartkid.com/images/242/
			// queen-crown-clip-art-at-clker-com-vector-clip-art-online-royalty-UyZz8b-clipart.png
			if (e.getSource() instanceof JButton) {
				name = ((JButton) e.getSource()).getText();
				if (name == "Check If Safe") {
					if (!verify.verifyBoard(board)) {
						queensActive--;
						int x = verify.getFailX();
						int y = verify.getFailY();

						boardButton[y][x].setIcon(null);
						board[x][y] = false;						
						JOptionPane.showMessageDialog(null,"Queens are at risk. Queen at (" + x + ", " + y + ") has been removed from the board.","Error",
								JOptionPane.ERROR_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null,"All queens on the current board are safe.","Valid",
								JOptionPane.QUESTION_MESSAGE);
					}
				}

				if (name == "Tip") {
					Tip buttonCheck = new Tip(board);
					if (buttonCheck.getTip() == null) {
						JOptionPane.showMessageDialog(null,"No more safe locations on the current board." ,"Tip",
								JOptionPane.QUESTION_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null,"Consider placing a queen at (" + buttonCheck.getTip() + ")" ,"Tip",
								JOptionPane.QUESTION_MESSAGE);
					}
				}
			}

			if (e.getSource() instanceof ChessPlace) {
				// Find and resolve coordinates of click
				int x = ((ChessPlace) e.getSource()).getX();
				int y = ((ChessPlace) e.getSource()).getY();
				x = ((ChessPlace) e.getSource()).resolveCoord(x);
				y = ((ChessPlace) e.getSource()).resolveCoord(y);
				// Divided steps above due to an issue always returned 0

				// Set icon if blank
				if (((ChessPlace) e.getSource()).getIcon() == null) {
					((ChessPlace) e.getSource()).setIcon(queen);
					queensActive++;
					board[x][y] = true;
				}    
				// Set icon null and decrease count of queens on board
				else {
					((ChessPlace) e.getSource()).setIcon(null);
					queensActive--;
					board[x][y] = false;
				}
			}
			// Hide buttons if 8+ queens are on board
			if (queensActive >= 8) {
				tipBasic.setEnabled(false);
				tipAdvance.setEnabled(false);
			}
			else {
				tipBasic.setEnabled(true);
				tipAdvance.setEnabled(true);
			}
		}
	}
}