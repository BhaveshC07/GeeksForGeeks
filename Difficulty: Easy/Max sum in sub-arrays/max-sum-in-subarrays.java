//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }

            Solution obj = new Solution();
            System.out.println(obj.pairWithMaxSum(a, n));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    public static long pairWithMaxSum(long arr[], long N) {
        // Your code goes here
        // long max=Integer.MIN_VALUE;
        // long currsum=0;
        // long maxsum=Integer.MIN_VALUE;
        // int count=0;
        // for( int i=0;i<N;i++){
        //     if(arr[i]>0){
        //         count++;
        //     }
        //     if(maxsum<arr[i]){
        //         maxsum=arr[i];
        //     }
        // }
        // if(count==0){
        //     return maxsum;
        // }
        
        // for(int i=0;i<N;i++){
        //     currsum+=arr[i];
        //     if(currsum<0){
        //         currsum=0;
        //     }
            
        // }
        // max = Math.max(max,currsum);
        // return max;
        
        long max=Integer.MIN_VALUE;
        long sum=Integer.MIN_VALUE;
        for (int i = 0; i < N-1; i++){
            sum = arr[i] + arr[i+1];
            if(sum > max){
                max = sum;
            }
            
        }
        return max;
    }
}