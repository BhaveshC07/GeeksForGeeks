//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr));
        }
    }
}
// } Driver Code Ends




// User function Template for Java

class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        String temp=arr[0];
        int n=arr.length;
        if(n==1) return arr[0];
        int count=0;
        for(int i=0;i<temp.length();i++){
            char s = temp.charAt(i);
            for(int j=1;j<n;j++){
                if(arr[j].charAt(i)==s){
                    if(j==n-1)count++;
                }else{
                    i=temp.length();
                    break;
                }
            }
        }
        return count==0? "-1" : temp.substring(0,count);
    }
}