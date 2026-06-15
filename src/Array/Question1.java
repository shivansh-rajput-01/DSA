package Array;

import java.util.Scanner;

// Given an array of marks print roll no(index) of student with marks less than 35

public class Question1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // input
        System.out.print("Enter marks of students: ");
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        // output
        System.out.print("Roll number of students with marks less than 35 are: ");
        for(int i=0; i<arr.length; i++){
            if(arr[i] < 35) System.out.print(i + " ");
        }
    }
}
