package LEC5;

import java.io.FileReader;
import java.util.concurrent.CompletionException;

public class CheckExcptn {
	public static void main(String[] args) {
		System.out.println("Hello");
		try {
			FileReader obj = new FileReader("/c/abc.text");
		}catch (CompletionException cm) {
			System.out.println(cm);
		}
		catch (Exception ab) {
			System.out.println(ab);
		}
		System.out.println("Hi");
	}
}
