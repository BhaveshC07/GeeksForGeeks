//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String s;
            s = br.readLine();

            Solution obj = new Solution();
            String res = obj.removeOuter(s);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


class Solution {
    public static String removeOuter(String s) {
        // code here
        Stack<Character> s1=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(s1.size()>=1){
                    sb.append(s.charAt(i));
                }
                s1.push(s.charAt(i));
            }else{
                if(s1.size()>1){
                    sb.append(s.charAt(i));
                }
                s1.pop();
            }
            
        }
        return sb.toString();
    }
}
