package shortString;


public class Solution{
    public static void main(String[] args){
        Solution S = new Solution();
        String test = "aaabbcddaa";
        S.shortString(test);


    } // end of main

    public String shortString(String str1){
        String result = "";
        char chArray = str1.toCharArray();
        int count = 0;
        for (int i=0;i<chArray.length;i++)
        {
            int initPosition = i;
            while(chArray[i]==chArray[i++])
                count++;
            else{

            }

        }


        return result;
    } //end of shortString




} //end of class

