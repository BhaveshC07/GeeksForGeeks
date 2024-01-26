//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}


// } Driver Code Ends


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
         return trap_rain(arr);
    } 
     public static long trap_rain(int num[]){
        int LM[]=new int[num.length];
        int RM[]=new int[num.length];
        LM[0]=num[0];
        for (int i = 1; i < num.length; i++) {
            LM[i]=Math.max(num[i],LM[i-1]);
        }
        RM[num.length-1]=num[num.length-1];
        for (int i = num.length-2; i >= 0; i--) {
            RM[i]=Math.max(num[i],RM[i+1] );
        }
        long trappwater =0;
        for (int i = 0; i < num.length ; i++) {
            long waterlvl=Math.min(LM[i],RM[i]);
            trappwater+=waterlvl-num[i];
        }
        return trappwater;
    }
}


