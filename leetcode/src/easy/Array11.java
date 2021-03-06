package easy;

import java.util.Arrays;

public class Array11 {
	
	public static void main(String[] args) {
		int[][] matrix = new int[][] {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
		rotate(matrix);
		
		for(int i = 0; i < 4; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}

    public static void rotate(int[][] matrix) {
     
    	int length = matrix.length;
    	int min = 0;
    	int max = length - 1;
    	int[] temp = null;
    	
    	while(length > 1) {
    		//change
    		temp = new int[length-1];
    		
    		for(int i = 0; i< length-1; i++) {
    			temp[i] = matrix[min][min+i];
    		}
    		
    		for(int i = 0; i < length-1; i++) {
    			matrix[min][min+i] = matrix[max-i][min];
    		}
    		
    		for(int i = 1; i < length; i++) {
    			matrix[min+i][min] = matrix[max][min+i];
    		}
    		
    		for(int i = 1; i < length; i++) {
    			matrix[max][min+i] = matrix[max-i][max];
    		}
    		
    		for(int i = 0; i < length-1; i++) {
    			matrix[min+i][max] = temp[i];
    		}
    		
    		length -= 2;
    		min += 1;
    		max -= 1;
    	}
    	
    }
}
