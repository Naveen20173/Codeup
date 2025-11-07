package Codeup.Assingment_1;

import java.util.Scanner;

public class Task_3 {
    public static int minimumFlip(int [] arr){
        int min=Integer.MAX_VALUE;
        int count_0 = 0;
        int count_1 = 0;
        for(int i=0;i< arr.length;i++){
            if(arr[i] == 0){
                count_0 += 1;
            }
            else{
                count_1 += 1;
            }
        }
//        if(count_1 > count_0){
//            return count_0;
//        }
//        else
//            return count_1;
        min=Math.min(count_0,count_1);
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int result;
        System.out.println(result = minimumFlip(arr));
    }
}
