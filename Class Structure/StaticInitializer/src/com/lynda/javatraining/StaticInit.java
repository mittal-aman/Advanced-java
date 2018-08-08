package com.lynda.javatraining;

import java.util.ArrayList;

import com.lynda.olivepress.olives.Olive;
import com.lynda.olivepress.olives.OliveJar;

public class StaticInit {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Starting Application");
		ArrayList<Olive> olives1 = OliveJar.olives;
		for(Olive o :olives1){
			System.out.println("It's a " + o.oliveName + " olive");
		}

	}
	
}
