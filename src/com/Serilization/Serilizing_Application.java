package com.Serilization;

import java.io.IOException;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Serilizing_Application {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Serializing_Class sc= new Serializing_Class();
		boolean b= sc.testSerialization();
		System.out.println(b);
		System.out.println("testing deserilization");
		DeserilizationTest dt= new DeserilizationTest();
		dt.deserilizationTest();
	}
	
}
