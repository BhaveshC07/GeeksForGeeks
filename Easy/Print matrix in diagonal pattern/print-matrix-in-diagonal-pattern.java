//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] mat = new int[n][n];
            String[] S = br.readLine().trim().split(" ");
            int i = 0;
            int j = 0;
            for(int k = 0; k < S.length; k++){
                mat[i][j] = Integer.parseInt(S[k]);
                j++;
                if(j == n){
                    i++;
                    j = 0;
                }
            }
            Solution obj = new Solution();
            int[] ans = obj.matrixDiagonally(mat);
            for(int it = 0; it < ans.length; it++){
                System.out.print(ans[it] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends

class Solution {
    public int[] matrixDiagonally(int[][] mat) {
        int i = 0, j = 0, k = 0;
        boolean isUp = true;
        
        int[] res = new int[mat.length * mat.length];
        
        while (k < res.length) {
            
            res[k++] = mat[i][j];
            
            if (isUp) {
                
                i--;
                j++;
                
                if (i < 0 && j >= mat.length) {
                    i += 2;
                    j--;
                    isUp = false;
                } else if (i < 0) {
                    i++;
                    isUp = false;
                } else if (j >= mat.length) {
                    i += 2;
                    j--;
                    isUp = false;
                }
                
            } else {
                
                i++;
                j--;
                
                if (i >= mat.length && j < 0) {
                    j += 2;
                    i--;
                    isUp = true;
                } else if (j < 0) {
                    j++;
                    isUp = true;
                } else if (i >= mat.length) {
                    j += 2;
                    i--;
                    isUp = true;
                }
                
            }
            
        }
        
        return res;
    }
}