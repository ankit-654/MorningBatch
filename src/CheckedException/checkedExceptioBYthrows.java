package CheckedException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class checkedExceptioBYthrows {

	public static void writeToFile() throws IOException {
	    BufferedWriter bw = new BufferedWriter(new FileWriter("myFile.txt"));
	    bw.write("Test");
	    bw.close();
	}

	public static void main(String[] args) {
//	try {
//	        writeToFile();
//	    } catch (IOException ioe) {
//	        ioe.printStackTrace();
//	    }
	}
}
