package diagonalDifference;

import java.lang.Integer;
import java.lang.System;
import java.util.Scanner;

public class Solution {
	
	public static void printArray(int array[][], int n, int m)
    {
    		for (int i = 0; i < n; i++)
    			{
    				for (int j = 0; j < m; j++)
    					{
    						System.out.println(array[i][j] + " ");
    					}	
    			}
    				
    	
    	
    }

    public static void main(String[] args) {
        /*
        Enter your code here.
        Read input from STDIN.
        Print output to STDOUT.
        Your class should be named Solution.
        */

        Scanner scanIn = null;
        int left_to_right_sum = 0;
        int right_to_left_sum = 0;

        try {
            scanIn = new Scanner(System.in);
            int no_of_rows = Integer.parseInt(scanIn.nextLine());
            int no_of_columns = no_of_rows;
            int numbers[][] = new int[no_of_rows][no_of_columns];
            for (int i =0; i<no_of_rows; i++)
            {
            		for (int j = 0; j<no_of_columns; j++)
            		{
            			numbers[i][j] = scanIn.nextInt();
            			if (i==j)
            			{
            				left_to_right_sum += numbers[i][j];
            			}
            			
            			if (i+j == no_of_rows-1)
            			{
            				right_to_left_sum += numbers[i][j];
            			}
            			
            		}
                //numbers[i] = scanIn.nextInt();
                //sum += numbers[i];

            }
            int absoulute_difference = Math.abs(left_to_right_sum - right_to_left_sum);
            System.out.println(absoulute_difference);
            
            
            
            //printArray(numbers, no_of_rows, no_of_columns );
         }

        finally {

            if (scanIn != null) {
                scanIn.close();
            }
        }
     

        //System.out.println(sum);

    }
    
    

}



