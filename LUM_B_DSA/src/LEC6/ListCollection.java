package LEC6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ListCollection {
	public static void main(String[] args) {
//		int num=10;
//		Integer number =num;
//		long lNum=109;
//		Long lobj= lNum;
//		long numberl=lobj;
//		Integer no=123;
//		int n=Integer.valueOf(no);
		List<Integer> ll = new ArrayList<>();
		ArrayList<Integer> ll1 = new ArrayList<>();
		ll.add(12);
		System.out.println(ll);
		ll.add(1, 2);
		System.out.println(ll);
		System.out.println(ll.contains(12));
		ll.add(0, 22);
		System.out.println(ll);
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(12123);
		System.out.println(linkedList);
		linkedList.addFirst(76);
		linkedList.addLast(4);
		linkedList.add(1);
		System.out.println(linkedList);
		Stack<Integer> st = new Stack<Integer>();
		st.push(12);
		st.pop();
//		st.add(null);
		
	}
}
