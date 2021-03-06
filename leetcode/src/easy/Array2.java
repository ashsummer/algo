package easy;

public class Array2 {

	public static void main(String[] args) {
		System.out.println(maxProfit(new int[] {1,2,3,4,5}));
	}
	public static int maxProfit(int[] prices) {
		
		int sum = 0;
		int len = prices.length;
		int min = prices[0];
		
		for(int i=1 ; i<len; i++) {
			if(prices[i-1]>prices[i]) {
				sum = sum + prices[i-1] - min;
				min = prices[i];
			}
		}
		
		sum = sum + prices[len-1] - min;
		
		return sum;
	}
}
