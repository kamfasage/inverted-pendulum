package com.github.laserchicken.ip;

public class Dynamics {

	//external force
	private double f;
	//time
	private double t = 0.0d;

	private final static double START_FI = (double)Math.PI/(double)2.0;
	private static double L;
	private final static double g = 9.81d;

	public Dynamics(int L){
		this.L = L;
	}
	//TODO : better name?
	//method updates/recount the state of differential equation model
	public void update(double f){
		t += 0.01d;
		//		System.out.println(t);
		//		System.out.println(Math.cos(t));
	}


	public int getCartX(){
		return 400;
	}

	public double getRodFi(){
		return (START_FI * Math.cos((double)(t) / Math.cbrt((double)L/(double)g)));
		//		return Math.cos(t);
		//		return 0.00001*t++;
	}
}
