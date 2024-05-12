//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            int d = Integer.parseInt(in.readLine());

            Solution ob = new Solution();
            System.out.println(ob.minSteps(d));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int minSteps(int d) {
        // code here
        int temp=0;
        int ans=0;
        int diff=0;
        while(temp<d){
            ans++;
            temp+=ans;
        }
        
        if(temp==d){
            return ans;
        }
        diff=temp-d;
        if(diff%2==0){
            return ans;
        }
        return ans%2==0?ans+1:ans+2;
    }
}