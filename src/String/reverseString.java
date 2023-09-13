package String;

public class reverseString {

	public static void main(String[] args) {
		String str="this is java class";
		String[] words=str.split("\\s");
		String outputString= "";
		for(int i=0;i<words.length;i++) {
			outputString=words[i]+" "+outputString; //this
			// is this
			//java is this 
			//class java is this
			
		}
		System.out.println(outputString.trim());
	}
}
