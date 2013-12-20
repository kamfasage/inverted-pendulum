package ip;

import java.awt.Graphics2D;

public class Cart {

	int x = 400;
	int y = 400;
	public static final int WIDTH = 80;
	public static final int HEIGHT = 50;

	void move(){
		x++;
		//y++;
	}

	public void paint(Graphics2D g){
		g.drawRect(x-WIDTH/2, y-HEIGHT/2, WIDTH, HEIGHT);
	}

	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}	
}