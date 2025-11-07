package Codeup.Assingment_1;

import java.util.Scanner;

public class Task_6 {
    public static int minTotaltime(int[] time){
        int totalSum = 0;
        int max = time[0];
        for(int i=0;i<time.length;i++){
            totalSum += time[i];
            if(max < time[i]){
                max = time[i];
            }
        }
        return totalSum - max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array:");
        int n = sc.nextInt();
        int [] time = new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0;i<time.length;i++){
            time[i] = sc.nextInt();
        }
        int result;
        System.out.println(result = minTotaltime(time));
    }
}
