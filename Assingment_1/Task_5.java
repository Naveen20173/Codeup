package Codeup.Assingment_1;

import java.util.Scanner;

public class Task_5 {
//    public static boolean smartPair(int[] nums,int target){
//        for(int i=0;i< nums.length;i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    public static boolean smartPair(int[] nums ,int target){
        int i = 0;
        int j = 1;
        while(i<nums.length && j<nums.length){
            if(nums[i] + nums[j] == target) {
                return true;}
                i++;
                j++;

        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array:");
        int n = sc.nextInt();
        System.out.println("Enter elements of array:");
        int [] nums = new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter target value:");
        int target = sc.nextInt();
        boolean ans;
        System.out.println(ans = smartPair(nums,target));
    }
}
