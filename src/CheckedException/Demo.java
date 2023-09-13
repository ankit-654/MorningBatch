package CheckedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
//		int [] arr=new int[] {1,5,8,7,4,6};
//		Arrays.sort(arr);
//		System.out.println("elements");
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		List<String> lst=new ArrayList<>();
		lst.add("Zebra");
		lst.add("Test");  // first time will sort in capital category
		lst.add("java"); // second time will sort in small letter category
		lst.add("kl");
		lst.add("ankit anand");
		Collections.sort(lst);
		System.out.println(lst);
		
//		TreeMap<String,String> arl=new TreeMap()<String>();
		
		
		              }
}
