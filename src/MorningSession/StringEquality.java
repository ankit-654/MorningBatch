package MorningSession;

public class StringEquality {
	public static void main(String[] args) {
		String s1=null;
		String s2="test";
		String s3="test";
		System.out.println(s2==s3);
		System.out.println(null==null);
				System.out.println(s1==null);
				System.out.println(s2.equals(s3));
				System.out.println(s2.equals("s3")); /// false
				
				Integer i1=new Integer(100);
				Integer i2=new Integer(100);
				System.out.println(i1==i2);  //false
				System.out.println(i1.equals(i2));
				
	}
}
