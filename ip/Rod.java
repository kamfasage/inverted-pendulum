package ip;

import java.awt.Graphics2D;

public class Rod {

	int pivotX = 400;
	int pivotY = 400;

	double fi = 0;
	
	public static final int LENGTH = 60;

	void move(){
		pivotX++;
		//y++;
	}

	void move(int pivotdx, double dfi){
		pivotX += pivotdx;
		fi += dfi;
	}

	public void paint(Graphics2D g){
		double y = Math.sin(fi) * (double) LENGTH;
		double x = Math.cos(fi) * (double) LENGTH;
		g.drawLine(pivotX, pivotY, pivotX + (int)x, pivotY + (int)y);
	}	

	public int getPivotX(){
		return pivotX;
	}

	public int getPivotY(){
		return pivotY;
	}	
}