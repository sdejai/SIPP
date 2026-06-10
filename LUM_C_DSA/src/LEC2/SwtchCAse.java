package LEC2;

import java.util.Scanner;

public class SwtchCAse {
	public static void main(String[] args) {
		Scanner scc = new Scanner(System.in);
		int i=scc.nextInt();
		switch (i) {
		case 10: System.out.println("ten");
		break;
		case 9: System.out.println("Nine");
		break;
		case 8: System.out.println("Eight");
		break;
		default: System.out.println("Invaild");
		break;
		}
		int num=13;
		long num2=num;
		System.out.println(num2);
		int intNum=124;
		byte bNum=(byte)intNum;
		System.out.println(bNum);
	}
}
