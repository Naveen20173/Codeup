package Codeup.Assingment_1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task_1 {
    public static int farthest_city(int[]num,int initialEnergy) {
        int energy = initialEnergy;
        int i;
        for (i = 0; i < num.length; i++) {
            energy -= num[i];
            System.out.println(energy);

            if (energy < 0) {
                return i-1;
            }
        }

        return num.length - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lenght of array:");
        int n = sc.nextInt();
        int [] num = new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0;i< num.length;i++){
            num[i] = sc.nextInt();
        }
        System.out.println("Enter initial energy:");
        int initialEnergy = sc.nextInt();
        int result = farthest_city(num, initialEnergy);
        System.out.println("Farthest city index is:" + result);
    }
}
