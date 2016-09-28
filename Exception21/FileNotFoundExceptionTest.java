package com.jian.exception;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotFoundExceptionTest {
 public void b() throws FileNotFoundException, IOException {
		FileInputStream in = new FileInputStream("myfile.txt");
		int j;
		j = in.read();
		while (j != -1) {
			System.out.println((char) j);
			j = in.read();
		}
	}
}
