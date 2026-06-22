package LEC6;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {
	public static void main(String[] args) {
		Set<Integer> st=new HashSet<Integer>();
//		HashSet<Integer> st1 = new HashSet<Integer>();
		st.add(4);
		System.out.println(st);
		st.add(3);
		st.add(56);
		st.add(56);
		st.add(6);
		st.add(90);
		st.add(509);
		System.out.println(st);
	}
}
