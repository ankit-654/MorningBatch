package Set;

import java.util.Arrays;
import java.util.List;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class headSet {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(20,30,50,60,70,40,47,25);
		SortedSet<Integer> setnumbers=new TreeSet<>(numbers);
		setnumbers.headSet(65).stream().forEach(System.out::print); // lower than 65
	    System.out.println();
		setnumbers.tailSet(46).stream().forEach(System.out::print);  // higher than 46
		System.out.println();
//		System.out.println(setnumbers.lower(49));   // will print one lower than 49 if there is any
		                                            // and if there is no any lower than it will println null
		                                             // same for .higher
	}
}
