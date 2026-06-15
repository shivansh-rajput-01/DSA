package Array;

import java.util.Scanner;

public class ArrayIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // array size input
        System.out.print("Enter length of array: ");
        int n = sc.nextInt();

        // array declaration
        int[] arr = new int[n];

        // array input
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // array output
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
