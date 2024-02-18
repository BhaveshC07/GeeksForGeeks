//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthFibonacci(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution {
    static int nthFibonacci(int n){
        // code here
        int n1=1,n2=1,n3;
        int ans=0; 
        if(n==1 || n==2){
            return 1;
        }
        for(int i=2;i<n;i++){    
          n3=(n1+n2)%1000000007;    
          n1=n2;    
          n2=n3;  
          ans=n3;
         }
         return ans;
    }
}