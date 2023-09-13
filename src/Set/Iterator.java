package Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
//import java.lang;

public class Iterator {

	public static void main(String[] args) {
		Room cambridge=new Room("Cambridge","Premier room",4,175.32);
		Room jhbjh=new Room("idge","Premier",4,175.32);
		Room hbjhkj=new Room("Cambr","room",4,175.32);
		Collection<Room> room=new ArrayList<>(Arrays.asList(cambridge,jhbjh,hbjhkj));
		
//		java.util.Iterator<Room> iterator=room.iterator();
		// if we  dont use this iterator to iteratev through all objects
		

		
		// when we dont use iterator that time we have to do like this
		java.util.Iterator<Room> iterator=room.iterator();
//		System.out.println(iterator.next().getS1());  for each  S1 name we hv to iterate over each data
//		System.out.println(iterator.next().getS1());  
//		System.out.println(iterator.next().getS1());//	
		while(iterator.hasNext()) {
		Room room1=iterator.next();
		System.out.print(room1.getFl());  // returs whole value present in that Fl object
		System.out.println(room1.getS2());  // returs whole value present in that S2 object
		}
		}
}
