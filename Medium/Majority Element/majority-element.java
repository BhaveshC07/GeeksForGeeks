//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public int majorityElement(int[] nums,int n) {
        if(n == 1) return nums[0];
        Arrays.sort(nums);
        int count = 0;
        int j = nums[0];
        for(int i=1;i<n;i++){
            if(nums[i] == j){
                count++;
                if(count >= n/2) return nums[i];
            }
            else{
                j = nums[i];
                count = 0;
            }
        }
        return -1;
    }
}