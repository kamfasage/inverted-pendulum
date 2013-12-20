package ip;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Point;

public class Simulation extends JPanel {

	private static final String TITLE = "Simulation";
	Cart cart = new Cart();

	@Override
	public void paint(Graphics g) {
		super.paint(g); //cleans the screen
		Graphics2D g2d = (Graphics2D) g;
		cart.paint(g2d);
	}	

	private void step(){
		cart.move();
	}

	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame(TITLE);
		Simulation simulation = new Simulation();
		frame.add(simulation);
		frame.setSize(800, 800);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		while (true) {
			simulation.step();
			simulation.repaint();
			Thread.sleep(10);
		}
					
	}
}