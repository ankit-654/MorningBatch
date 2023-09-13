package Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class checkPetAllowed {

	public static void main(String[] args) {
		Room cambridge=new Room("Cambridge","Premier room",4,175.32);
		Room oxford=new Room("oxford","Premier",4,175.32);
		Room victoria=new Room("victoria","room",4,175.32);
		Room manchester=new Room("manchester","room",4,175.32);
		Collection<Room> rooms=new ArrayList<>(Arrays.asList(cambridge,oxford,victoria,manchester));
		manchester.setPEtFreindly(true);
		cambridge.setPEtFreindly(true);
		
//		Collection<Room>removeRooms=new ArrayList<>();
//		for(Room room:rooms) {
//			if(room.isPetFreindly) {
//             removeRooms.add(room);
//			}
//		}
//		rooms.removeAll(removeRooms);
		
		
//		for(Room room:rooms) {
//			if(room.isPetFreindly) {
//				System.out.println(room.getS1());
//			}
//		}
		
//		Iterator<Room>iterator=rooms.iterator();
//		while(iterator.hasNext()) {
//			Room room=iterator.next();
//			if(Room.isPetFreindly) {
//				iterator.remove();
//			}
//		}
		rooms.stream().forEach(r -> System.out.println(r.getS1()));
		
	}
}
