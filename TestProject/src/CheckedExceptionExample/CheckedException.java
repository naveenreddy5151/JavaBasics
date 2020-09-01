package CheckedExceptionExample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CheckedException {
	public static void main (String[] args) {
		FileReader in = null;
	    FileWriter out = null;
	    try {
	    	in = new FileReader ("C:\\Naveen\\hello.txt");
	    	out = new FileWriter("C:\\Naveen\\Output.txt");
	    	int a;
	    	while ((a = in.read())!=-1) {
	    		out.write(a);
	    	}
	    }
	    catch (FileNotFoundException e) {
	    	System.out.println("In file not found exception");
	    }
	    catch (IOException e) {
	    	e.printStackTrace();
	    }
	    catch (Exception e) {
	    	System.out.println("in generic exception ");
	    }
	    finally {
	    	System.out.println("execution is mandatory");
	    	try {
	    		in.close();
	    		out.close();
	    	}
	    	catch (IOException e) {
	    		e.printStackTrace();
	    	}
	    }
	}

}
