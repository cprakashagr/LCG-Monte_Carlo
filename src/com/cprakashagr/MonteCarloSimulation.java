package com.cprakashagr;

import java.util.Scanner;

import com.cprakashagr.LCG;

/**
 * @author Chandra Prakash
 * @date March' 17th, 2014.
 */
public class MonteCarloSimulation {

	private Scanner sc;

	public MonteCarloSimulation() {
		// TODO Auto-generated constructor stub
		int i=0, inside = 0;
		LCG randomNumber = new LCG();
		sc = new Scanner(System.in);
		
		System.out.println("Number of Darts?");
		double noDarts = sc.nextInt();
		
		System.out.println("Radius?");
		double radius = sc.nextDouble();
		
		for (i=0;i<noDarts;i++) {
			
			double x = randomNumber.myRandom(0,(int)radius);
			double y = randomNumber.myRandom(0,(int)radius);
			
			if (x*x + y*y <= radius*radius) {
				inside++;
			}
		}
		
		double myPie = (4*inside)/noDarts;
		System.out.println(myPie);
		System.out.println(inside + " " + noDarts);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new MonteCarloSimulation();
	}

}
