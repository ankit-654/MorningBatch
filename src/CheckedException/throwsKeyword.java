package CheckedException;

public class throwsKeyword {
public static void main(String[] args) {
	try {
		 Class temp=Class.forName("gfg");
	}
	catch(ClassNotFoundException e) {
		e.getException();
	}
}
}
