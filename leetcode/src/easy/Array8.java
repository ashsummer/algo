package easy;

import java.util.*;

public class Array8 {
	
	public static void main(String[] args) {
		
	}

    public void moveZeroes(int[] nums) {
    	Queue<Integer> queue = new LinkedList();
    	int cnt = 0;
    	
    	for(int i = 0 ; i < nums.length ; i++) {
    		if(nums[i]!=0) {
    			queue.add(nums[i]);
    		}else {
    			cnt++;
    		}
    	}
    	
    	for(int i = 0 ; i < nums.length; i++) {
    		if(i<nums.length-cnt) nums[i] = queue.poll();
    		else nums[i] = 0;
    	}
    }
}
