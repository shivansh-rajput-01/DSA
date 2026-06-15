package Array;

import java.util.Scanner;

public class LinearSearch {

    static int LinearSearch(int[] arr, int x){
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i] == x) return i;
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to be searched: ");
        int x = sc.nextInt();
        int idx = LinearSearch(arr, x);
        if(idx == -1) System.out.println("Element " + x + " not found");
        else System.out.println("Element " + x + " founded at index " + idx);
        sc.close();
    }
}
