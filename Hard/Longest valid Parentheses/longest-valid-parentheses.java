//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String S = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.maxLength(S));
        }
    }
}
// } Driver Code Ends

//User function Template for Java

class Solution{
    static int maxLength(String S){
        // code here
        Stack<Character> st=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        int count=0;
        int n=S.length();
        for(int i=0;i<n;i++){
            char ch=S.charAt(i);
            if(!st.isEmpty() && st.peek()=='(' && ch==')'){
                st.pop();
                st2.pop();
                
                if(st2.isEmpty()){
                    count=i+1;
                }else{
                    count=Math.max(count,i-st2.peek());
                }
            }else{
                st.push(ch);
                st2.push(i);
            }
        }
        
        return count;
    }
}