package easy;

public class String2 {
	
	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
	}
	
    public static int reverse(int x) {
    	
        int answer = 0;
        
        boolean negative = false;
        
        if(x==0) return answer;
        
        if(x<0) {
        	x *= -1;
        	negative = true;
        }
        
        int num = 10;
        StringBuilder sb = new StringBuilder();
        
        while(x>0) {
        	sb.append(x%num);
        	x /= num;
        }
        
        try{
        	answer = Integer.parseInt(sb.toString());
        }catch(Exception e) {
        	return 0;
        }
        
        if(negative) answer *= -1;
        
        return answer;
    }
    
}
