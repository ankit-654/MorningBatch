package MorningSession;

import java.util.HashSet;

public class hashSet {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		boolean b1=hs.add("Hello");
		boolean b2=hs.add("Good");  
		boolean b3=hs.add("Good");  //same to b2 it will be terminated 
		boolean b4=hs.add("mo");
		System.out.println("first   "+b1);
		System.out.println("second   "+b2);
		System.out.println("third   "+b3);
		System.out.println("fourth   "+b4);
		System.out.println(hs);
		// o/p depnds on string elements number like first  | "mo" | come then good comes thats how
	}
}
