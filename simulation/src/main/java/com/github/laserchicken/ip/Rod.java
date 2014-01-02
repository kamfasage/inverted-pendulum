package com.github.laserchicken.ip;

import java.awt.Graphics2D;

public class Rod {

	int pivotX = 400;
	int pivotY = 400;

	double fi = 0;
	
	public static final int LENGTH = 150;

	void move(){
		pivotX++;
		//y++;
	}

	void move(int pivotDx, double Dfi){
		pivotX += pivotDx;
		fi += Dfi;
	}

	public void paint(Graphics2D g){
		double y = Math.cos(fi) * (double) LENGTH;
		double x = Math.sin(fi) * (double) LENGTH;
		g.drawLine(pivotX, pivotY, pivotX - (int)x, pivotY - (int)y);
	}	

	public int getPivotX(){
		return pivotX;
	}

	public int getPivotY(){
		return pivotY;
	}	
}