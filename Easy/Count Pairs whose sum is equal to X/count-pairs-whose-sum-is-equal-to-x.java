//{ Driver Code Starts
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}

class count_pairs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n1 = sc.nextInt();
            Integer arr1[] = new Integer[n1];

            for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

            int n2 = sc.nextInt();
            Integer arr2[] = new Integer[n2];

            for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();

            LinkedList<Integer> head1 = new LinkedList<>(Arrays.asList(arr1));
            LinkedList<Integer> head2 = new LinkedList<>(Arrays.asList(arr2));

            int x = sc.nextInt();
            Solution gfg = new Solution();
            System.out.println(gfg.countPairs(head1, head2, x));
        }
    }
}
// } Driver Code Ends


// your task is to complete this function

/*
class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {

    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                          int x) {
        int count = 0;
        
        // Sort both lists
        // Integer[] arr1 = head1.toArray(new Integer[head1.size()]);
        // Integer[] arr2 = head2.toArray(new Integer[head2.size()]);
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        // int i = 0;
        // int j = arr2.length - 1;
        // while (i < arr1.length && j >= 0) {
        //     int sum = arr1[i] + arr2[j];
        //     if (sum == x) {
        //         count++;
        //         i++;
        //         j--;
        //     } else if (sum < x) {
        //         i++;
        //     } else {
        //         j--;
        //     }
        // }
        // return count;

        HashSet<Integer> set = new HashSet<>(head2);
        
        for (int num : head1) {
            int complement = x - num;
            if (set.contains(complement)) {
                count++;
            }
        }
        
        return count;
    }
    
}
