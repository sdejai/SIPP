package LEC5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.concurrent.CompletionException;

public class CheckException {
	public static void main(String[] args) {
		System.out.println("hey");
		try {
			FileReader obj = new FileReader("c/ab.text");
		}
		catch (FileNotFoundException ab) {
			System.out.println(ab);
		}catch (Exception e) {
			System.out.println(e);
		}
		
		
		System.out.println("hello");
	}
}
