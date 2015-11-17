package uglyNumber;



public class Solution {
    public boolean isUgly(int num) {
    	boolean result = false;
    	
    	if (num == 0) return false;
    	
    	
    	while (num%2==0)
    	{
    		num = num/2;
    	}
    	
    	while (num%3==0)
    	{
    		num = num/3;
    	}
    	while (num%5==0)
    	{
    		num = num/5;
    	}
    	//System.out.println(num);
    	if (num==1)
    		result = true;
    	return result;
        
    }
    public static void main(String args[])
    {
    	Solution s = new Solution();
    	System.out.println("1" + s.isUgly(0));
    	System.out.println("6" + s.isUgly(6));	
    	System.out.println("8" + s.isUgly(8));	
    	System.out.println("14" + s.isUgly(14));	
    	System.out.println("14" + s.isUgly(1024));	

    }
}


