package happyNumber;

import java.util.ArrayList;


public class Solution {
    public boolean isHappy(int n) {
    	boolean result = false;
    	int sum = n;
    	
    	if (sum==1)
    		return true;
    	
    	while (sum!=1)
    	{
    		int newsum = 0;
    		for(Integer x: getDigit(sum))
    		{
    			//System.out.println(x)
    			newsum += x*x;
    		}
    		//System.out.println(newsum);
    		
    		if (newsum==1)
    		{
    			result = true;
    			break;
    		}
    		else{
    			sum = newsum;
    		}
    		
    	} 

        
    	
    	return result;
    }
    
    public ArrayList<Integer> getDigit(int number)
    {
    	ArrayList<Integer> digits = new ArrayList<Integer> ();
    	
    	while(number!=0)
    	{
    		int remainder = number%10;
    		digits.add(remainder);
    		number = number/10;
    	}
    	
    	//System.out.println(digits);
    	
    	return digits;
    	
    	
    }
    
    public static void main(String args[])
    {
    	Solution s = new Solution();
    	//System.out.println("1" + s.isHappy(0));
    	//System.out.println("6" + s.isHappy(6));	
    	//System.out.println("8" + s.isHappy(8));	
    	System.out.println("14" + s.isHappy(14));	
    	System.out.println("19" + s.isHappy(19));	

    }
}