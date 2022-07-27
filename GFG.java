package GFGSolve;

//Given an array A of size N, print the reverse of it.
//
//        Example:
//
//        Input:
//        1
//        4
//        1 2 3 4
//        Output:
//        4 3 2 1
//        Input:
//        First line contains an integer denoting the test cases 'T'. T testcases follow. Each testcase contains two lines of input. First line contains N the size of the array A. The second line contains the elements of the array.
//
//        Output:
//        For each testcase, in a new line, print the array in reverse order.
//
//        Constraints:
//        1 <= T <= 100
//        1 <= N <=100
//        0 <= Ai <= 100

import java.util.*;
        import java.lang.*;
        import java.io.*;

class GFG {
    public static void reverse (int arr[]) {
        //code
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            int size= sc.nextInt();
            int arr[]=new int[size];
            for(int j=0;j<size;j++){
                arr[j]=sc.nextInt();
            }
            reverse ( arr);
        }
    }
}
