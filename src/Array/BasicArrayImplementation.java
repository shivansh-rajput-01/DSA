package Array;

import java.util.Scanner;

public class BasicArrayImplementation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Enter 1 to add elements and 2 to multiply them: ");
        int input = sc.nextInt();
        int sum = 0;
        int prod = 1;
        for(int i = 0; i < arr.length; i++){
            if(input == 1){
                sum += arr[i];
            }
            else if(input == 2){
                prod *= arr[i];
            }
        }
        if(input == 1) System.out.println("Your answer is: " + sum);
        else System.out.println("Your answer is: " + prod);
    }
}
