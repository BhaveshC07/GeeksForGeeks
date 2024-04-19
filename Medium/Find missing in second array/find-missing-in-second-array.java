//{ Driver Code Starts
//Initial Template for Java





import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java



class Solution
{
    ArrayList<Integer> findMissing(int a[], int b[], int n, int m)
    {
        //Arrays.sort(a);
        // Arrays.sort(b);
        // ArrayList<Integer> al=new ArrayList<>();
        // int i=0;
        // int j=0;
        // while (i < n && j < m) {
        //     if (a[i] < b[j]) {
        //         al.add(a[i]);
        //         i++;
        //     } else if (a[i] > b[j]) {
        //         j++;
        //     } else {
        //         i++;
        //         j++;
        //     }
        // }
        // while (i < n) {
        //     al.add(a[i]);
        //     i++;
        // }
        // return al;
        
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0; i<m; i++){
            set.add(b[i]);
        }
        for(int i=0; i<n; i++){
            if(!set.contains(a[i])){
                list.add(a[i]);
            }
        }
        return list;
    }
}


//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int m =Integer.parseInt(q[1]);
            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(a1[i]);
            }
            String line2 = br.readLine();
            String[] a2 = line2.trim().split("\\s+");
            int b[] = new int[m];
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(a2[i]);
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans=ob.findMissing(a,b,n,m);
            for (int i = 0; i < ans.size(); i++) {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();

        }
    }
}



// } Driver Code Ends