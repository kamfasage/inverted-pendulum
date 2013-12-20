package ip;

import java.awt.Graphics2D;

public class Rod {

	int x = 400;
	int y = 400;
	public static final int LENGTH = 60;

	void move(){
		x++;
		//		y++;
	}

	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}	
}