package bigSum;

import java.lang.Integer;
import java.lang.System;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /*
        Enter your code here.
        Read input from STDIN.
        Print output to STDOUT.
        Your class should be named Solution.
        */

        Scanner scanIn = null;
        long sum = 0;

        try {
            scanIn = new Scanner(System.in);
            int no_of_elements = Integer.parseInt(scanIn.nextLine());
            long numbers[] = new long[no_of_elements];
            for (int i =0; i<no_of_elements; i++)
            {
                numbers[i] = scanIn.nextInt();
                sum += numbers[i];

            }
         }

        finally {

            if (scanIn != null) {
                scanIn.close();
            }
        }


        System.out.println(sum);

    }

}


