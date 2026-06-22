package LEC6;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
	public static void main(String[] args) {
		Map<String,String> mp = new HashMap<String, String>();
		mp.put("RAM","KUMAR" );
		System.out.println(mp);
		Map<Character,Integer> count = new HashMap<>();
		String str="endfjkfd";
		for(int i=0;i<str.length();i++) {
			if(count.containsKey(str.charAt(i))) {
				count.put(str.charAt(i),count.get(str.charAt(i))+1);
			}
			else {
				count.put(str.charAt(i),1);
			}	
		}
		System.out.println(count);
	}
}
