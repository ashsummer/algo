package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Arrays.toString(intersect(new int[] {1,2,2,1}, new int[] {2,2})));
	}
	
    public static int[] intersect(int[] nums1, int[] nums2) {
    	
    	int[] answer = new int[] {};
    	
    	if (nums1.length == 0 || nums2.length == 0 ) return answer;
    	
    	HashMap<Integer,Integer> map = new HashMap<>();
    	ArrayList<Integer> list = new ArrayList<>();
    	
    	for(int i = 0; i < nums1.length; i++) {
    		if(map.get(nums1[i])!=null) {
    			map.put(nums1[i], map.get(nums1[i])+1);
    		}else {
    			map.put(nums1[i], 1);
    		}
    	}
    	
    	
    	for(int j = 0; j < nums2.length; j++) {
    		if(map.get(nums2[j])!=null) {
    			list.add(nums2[j]);
    			map.put(nums2[j],map.get(nums2[j])-1);
    			if(map.get(nums2[j])==0) {
    				map.remove(nums2[j]);
    			}
    		}
    	}
    	
    	answer = new int[list.size()];
    	
    	int idx = 0;
    	
    	for(int a : list) {
    		answer[idx++] = a;
    	}
    	
    	Arrays.sort(answer);
    	
        return answer;
    }

}
