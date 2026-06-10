package LEC2;

import java.util.Scanner;

public class Methods {
	
	public static int sum(int num1,int num2) {
		int sum=num1+num2;
		return sum;
	}
	public int sub(int num1,int num2) {
		int diff=num1-num2;
		return diff;
	}
	public static void main(String[] args) {
		Methods mds = new Methods();
		System.out.println(mds.sub(12, 3));
		System.out.println(sum(12,3));
	}
}
