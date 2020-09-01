package com.CharacterStream;

import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStreamExample {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("C:\\Naveen\\hello.txt");
		FileWriter fw = new FileWriter("C:\\Naveen\\Output3.txt");
		char c;
		while((c=(char) fr.read())!=-1) {
			fw.write(c);
			
		
		}
		fr.close();
		fw.close();
     
	}

}
