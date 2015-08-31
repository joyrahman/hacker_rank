import java.io.*;
import java.io.BufferedReader;
import java.lang.Integer;
import java.lang.System;
import java.util.*;
import java.util.ArrayList;
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
        int sum = 0;

        try {
            scanIn = new Scanner(System.in);
            int no_of_elements = Integer.parseInt(scanIn.nextLine());
            int numbers[] = new int[no_of_elements];
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


