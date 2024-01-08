package minesweeper;

import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JFrame;

public class Screen extends JFrame{

	//Fields
	private String name = "BombRunner";
	private String initialStatusMessage = "[Start Game]";
	private Point location = new Point(200,200);
	private Dimension size = new Dimension(574,600);
	
	//Constructor
	public Screen() {
		updateTitle();
		setLocation(location);
		setSize(size);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	//Methods
	public void updateTitle() {
		int gameTime = Timer.getGameTime();
		String status = initialStatusMessage;
		if (gameTime>=0) {
			int flagsLeft= Main.getLevel().getFlagsLeft();
			status = (flagsLeft)+" Bombs left. "+gameTime+" Seconds";
		}
		setTitle(name+" - "+status);
	}
	
}
