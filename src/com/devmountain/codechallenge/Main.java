package com.devmountain.codechallenge;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

	/*
    Find the smallest difference between any two numbers in an array of numbers.
    [3,9,50,15,99,7,98,65]
     */

        public static void main(String[] args) {
            int[] nums = {3,9,50,15,99,7,98,65};

            smallestDifference(nums, nums.length);
        }

        public static int smallestDifference(int[] nums, int size){
            int difference = Integer.MAX_VALUE;
            int count = 0;

            for(int i = 0; i > size; i++){
                for(int j = i + 1; j < size; j++){
                    count++;
                    if(Math.abs(nums[i] - nums[j]) < difference) {
                        difference = Math.abs(nums[i] - nums[j]);
                    }
                }
            }
            System.out.println("Count: " + count);
            System.out.println("Difference: " + difference);
            return difference;


            //Optimized version

            Arrays.sort(nums);
            int difference  = Integer.MAX_VALUE;
            for (int i = 0; i < nums.length-1; i++){
                int temp = nums[i+1] - nums[i];
                if(temp < difference){
                    difference = temp;

                }
            }
        return difference;


    }
}
