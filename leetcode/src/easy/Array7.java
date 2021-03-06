package easy;

import java.util.Arrays;

public class Array7 {
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(plusOne(new int[] {9})));
	}
	
    public static int[] plusOne(int[] digits) {
    	
    	for(int i = digits.length-1 ; i >= 0; i--) {
    		if(digits[i]+1 < 10) {
    			digits[i] += 1;
    			break;
    		}else {
    			digits[i] = 0;
    			if(i == 0) {
    				digits = Arrays.copyOf(digits, digits.length+1);
    				digits[0] = 1;
    			}
    		}
    	}
        
    	return digits;
    }
}
