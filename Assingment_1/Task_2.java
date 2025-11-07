package Codeup.Assingment_1;

import java.util.Scanner;

public class Task_2 {
    public static int result(int[] nums){
       int totalSum = 0;

       //calculate sum of all elements of array
       for(int i=0;i<nums.length;i++){
           totalSum += nums[i];
       }
       System.out.println("Total sum is:" +totalSum);
       int preFix = 0;
       for(int i=0;i< nums.length;i++){
           int sufFix = totalSum - preFix - nums[i];

           if(sufFix == preFix){
               return i;
           }
           preFix += nums[i];
       }
       return -1;//-1 will return if no such index is found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int [] nums = new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        int ans = result(nums);
        System.out.println(ans);
    }
}
