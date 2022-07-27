package GFGSolve3;
//Kth smallest element
//        MediumAccuracy: 46.66%Submissions: 100k+Points: 4
//        Lamp
//        This problem is part of GFG SDE Sheet. Click here to view more.
//
//        Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.
//
//        Example 1:
//
//        Input:
//        N = 6
//        arr[] = 7 10 4 3 20 15
//        K = 3
//        Output : 7
//        Explanation :
//        3rd smallest element in the given
//        array is 7.
//        Example 2:
//
//        Input:
//        N = 5
//        arr[] = 7 10 4 20 15
//        K = 4
//        Output : 15
//        Explanation :
//        4th smallest element in the given
//        array is 15.
//        Your Task:
//        You don't have to read input or print anything. Your task is to complete the function kthSmallest() which takes the array arr[], integers l and r denoting the starting and ending index of the array and an integer K as input and returns the Kth smallest element.
//
//
//        Expected Time Complexity: O(n)
//        Expected Auxiliary Space: O(log(n))
//        Constraints:
//        1 <= N <= 105
//        1 <= arr[i] <= 105
//        1 <= K <= N
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t=sc.nextInt();

        while(t-->0)
        {
            int n=sc.nextInt();

            int arr[]=new int[n];

            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();

            int k=sc.nextInt();
            Solution ob = new Solution();
            out.println(ob.kthSmallest(arr, 0, n-1, k));
        }
        out.flush();
    }
}

// } Driver Code Ends



//User function Template for Java
class Solution{
    static int count(int [] arr, int mid)
    {
        // function to calculate number of elements less than equal to mid
        int cnt = 0;

        for(int i = 0; i < arr.length; i++)
            if(arr[i] <= mid)
                cnt++;

        return cnt;
    }
    public static int kthSmallest(int[] arr, int l, int r, int k)
    {
        //Your code here
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        //calculate minimum and maximum the array.
        for(int i = 0; i < arr.length; i++)
        {
            low = Math.min(low, arr[i]);
            high = Math.max(high, arr[i]);
        }
        //Our answer range lies between minimum and maximum element of the array on which Binary Search is Applied
        while(low < high)
        {
            int mid = low + (high - low) / 2;
               /*if the count of number of elements in the array less than equal to mid is less than k
                 then increase the number. Otherwise decrement the number and try to find a better answer.
               */
            if(count(arr, mid) < k)
                low = mid + 1;

            else
                high = mid;
        }

        return low;
    }
}