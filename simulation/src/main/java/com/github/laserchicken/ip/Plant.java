package com.github.laserchicken.ip;

import java.awt.Graphics2D;

public class Plant {

	private Cart cart;
	private Rod rod;
	private Dynamics dynamics;

	public Plant(){
		cart = new Cart();
		rod = new Rod();
		dynamics = new Dynamics();
	}

	public void move(){
		cart.move();
		rod.move();
	}

	/**
	 * @param f a force acting on a cart
	 */
	public void move(double f){
		dynamics.update(f);
		cart.move(dynamics.getCartDx());
		rod.move(dynamics.getCartDx(), dynamics.getRodDfi());
	}	

	public void paint(Graphics2D g){
		cart.paint(g);
		rod.paint(g);
	}
}