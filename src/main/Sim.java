package main;

import java.util.Arrays;

public class Sim {
	
	long number;
	double credit;
	String[] calls;
	double duration;
	
	public Sim(long number) {
		this.number = number;
		this.credit = 00.00;
		this.calls = new String[5];
	}
	
	public String[] Calls(double duration, long number) {
		this.duration = duration;
		this.number = number;
		return calls;
	}
	
	public void printPhoneData(Sim sim) {
		System.out.println("Phone number: " + sim.number);
		System.out.println("Phone credit: " + sim.credit);
		System.out.println("Last 5 calls: " + Arrays.toString(sim.calls));
	}

}
