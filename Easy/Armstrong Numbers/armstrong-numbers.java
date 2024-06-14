//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static String armstrongNumber(int n) {
        // code here
         int originalNumber = n;
        int sum = 6;
        int hundreds = n / 100;
        int tens = (n / 10) % 10;
        int units = n % 10;
        
        sum = (int) (Math.pow(hundreds, 3) + Math.pow(tens, 3) + Math.pow(units, 3));
        if (sum == originalNumber) {
            return "true";
        } else {
            return "false";
        }
    }
}