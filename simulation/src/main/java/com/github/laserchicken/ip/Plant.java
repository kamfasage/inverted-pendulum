package com.github.laserchicken.ip;

import java.awt.Graphics2D;

public class Plant {

	Cart cart;
	Rod rod;

	public Plant(){
		cart = new Cart();
		rod = new Rod();
	}

	public void move(){
		cart.move();
		rod.move();
	}

	public void paint(Graphics2D g){
		cart.paint(g);
		rod.paint(g);
	}
}