package LEC6;

import java.util.ArrayList;
import java.util.List;

public class CreatetragetArray {

	public static int[] createTragetArray(int[] nums, int[] inx) {
		List<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++) {
			al.add(inx[i], nums[i]);
		}
		int target[]=new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			target[i]=al.get(i);
		}
		return target;
	}
	
	public static void main(String[] args) {
		int nums[]= {0,1,2,3,4};
		int inx[]= {0,1,2,2,1};
		createTragetArray(nums,inx);
	}

}
