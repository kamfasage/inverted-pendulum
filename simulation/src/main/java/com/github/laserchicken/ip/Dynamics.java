package com.github.laserchicken.ip;

public class Dynamics {

	//external force
	private double f;
	//time
	private int t = 0;

	//TODO : better name?
	//method updates/recount the state of differential equation model
	public void update(double f){
	}


	public int getCartDx(){
		return 0;
	}

	public double getRodDfi(){
		return 0.001*t++;
	}
}