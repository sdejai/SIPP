package LEC6;

import java.util.ArrayList;
import java.util.List;

public class CreatetargetArray {
	public static int[] createTargetArray(int[] nums, int[] index) {
		List<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++) {
			al.add(index[i],nums[i]);
		}
		int arr[] = new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			arr[i]=al.get(i);
		}
		return arr;
		
	}
	public static void main(String[] args) {
		int nums[]= {0,1,2,3,4};
		int index[]= {0,1,2,2,1};
		createTargetArray(nums,index);
	}

	
}
