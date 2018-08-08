package com.lynda.javatraining;

import java.util.ArrayList;
import java.util.Random;

import com.lynda.olivepress.olives.Olive;

public class StringsInSwitch {

	public static void main(String[] args) throws Exception {

		Olive o1 = new Olive("Kalamata", 0x000000);
		Olive o2 = new Olive("Picholine", 0x00FF00);
		Olive o3 = new Olive("Ligurio", 0x000000);
		Olive o4 = new Olive("Liguri", 0x000000);
		
		ArrayList<Olive> list = new ArrayList<>();
		
		list.add(o1);
		list.add(o2);
		list.add(o3);
		list.add(o4);
		
		Random generator = new Random();
		int index = generator.nextInt(4);
		System.out.println("random variable:" +index);
		
		Olive o = list.get(index);
		
		switch (o.oliveName) {
		case "Kalamata":
			System.out.println("It's Greek!");
			break;
		case "Picholine":
			System.out.println("It's French!");
			break;
		case "Ligurio":
			System.out.println("It's Italian!");
			break;
			

		default:
			System.out.println("I don't know!!!");
			break;
		}
		
	
	}
	
}
