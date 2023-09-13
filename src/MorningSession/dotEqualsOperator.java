package MorningSession;

public class dotEqualsOperator {

	public static void main(String[] args) {
String s1=new String("test");//two object creation one is SCP and other in heap memory when new keyword is used
String s2=new String("test");
String s3=new String("demo");
		System.out.println(s1==s2);    //object reference is not same 
		System.out.println(s1==null);   // cannot compare with null values
		System.out.println(s1.equals(s2));   // true 
		System.out.println(s2.equals(s3));  // false 
		System.out.println(s1.equals(null));// cannot compare object with null 
//CTE	System.out.println(null.equals(s1));    null does not point any objet references 
//CTE	System.out.println(s1.equals(NULL));    null is a keyword and here it is pointing to NULL variable
		System.out.println(s1.equals("test"));
	}
}
