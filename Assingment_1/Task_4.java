package Codeup.Assingment_1;

import java.util.Scanner;

public class Task_4 {
    public static int XOR(int[] arr){
        int ans = 0;
        for(int i=0;i< arr.length;i++){
            ans ^= arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array:");
        int n = sc.nextInt();
        System.out.println("Enter an array where every element appears twice except one:");
        int [] arr = new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int result;
        System.out.println(result = XOR(arr));
    }
}
