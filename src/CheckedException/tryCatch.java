package CheckedException;

public class tryCatch {
public static void main(String[] args) throws ClassNotFoundException {
	
//	Class temp=Class.forName("tex");
//	 for user freindly message
	try {
		Class temp=Class.forName("tex");
	}catch(ClassNotFoundException e) {
		
		System.out.println(e.getMessage());
	}
//	try {
//		Class temp=Class.forName("rex");
//	}catch(ClassNotFoundException e) {
//		
//		System.out.println(e.getMessage());
//	}try {
//		Class temp=Class.forName("nex");
//	}catch(ClassNotFoundException e) {
//		
//		System.out.println(e.getMessage());
//	}
}
}
