package edu.orangecoastcollege.sbadajoz.ic17;

import java.util.Scanner;

/*
Badajoz, Seve
CS A170
October 28, 2016

IC17
*/
public class IntroToArrays {
    public static void main(String[] args) {
        int[] num = new int[10];
        int largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
        double sum = 0.0;
        
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < num.length; i++) {
            System.out.print("Please enter value #" + (i + 1) + ": ");
            num[i] = input.nextInt();
            if (num[i] < smallest) smallest = num[i];
            if (num[i] > largest) largest = num[i];
            sum += num[i];
        }
        System.out.println("The largest value in the array is  : " + largest);
        System.out.println("The smallest value in the array is : " + smallest);
        System.out.println("The sum of values in the array is  : " + sum);
        System.out.println("The average value in the array is  : " + (sum/num.length));
    }
}
