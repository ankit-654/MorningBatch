package Set;

import java.util.Arrays;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

class ListToTree{
	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(20,30,50,60,70,40,47,25);
		SortedSet<Integer> setnumbers=new TreeSet<>(numbers);
		NavigableSet<Integer> s1=new TreeSet<>(numbers);
		
//		setnumbers.subSet(48, 78).stream().forEach(System.out::print);
//		System.out.println();
//		setnumbers.add(45);  //add
//		setnumbers.remove(47); //remove
		setnumbers.isEmpty();
		System.out.println(setnumbers);
//		setnumbers.clear();  // clear whole array
//		System.out.println(setnumbers);
	
		
//		setnumbers.stream().forEach(System.out::println);   // between
//		System.out.println();    // ascending or sorted
//		s1.descendingSet().stream().forEach(System.out::print); // Descending order 
		}
	
	
	
}