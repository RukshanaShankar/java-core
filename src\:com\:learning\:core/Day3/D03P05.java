package com.learning.core.day3;

import java.util.Scanner;

public class D03P05 {
	public static void findComb(int[] nums, int k) {
        int[] comb = new int[k];
        showComb(nums, k, 0, 0, comb);
    }

    public static void showComb(int[] nums, int k, int start, int index, int[] combination) {
        if (index == k) {
            for (int i = 0; i < k; i++) {
                System.out.print(combination[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i < nums.length; i++) {
            combination[index] = nums[i];
            showComb(nums, k, i + 1, index + 1, combination);
        }
    }
    
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
		int i,k;
		int[] num = new int[3];
		for(i=0;i<num.length;i++)
			{
				num[i] = sc.nextInt();
			}
		k = sc.nextInt();
		findComb(num,k);
    }

}
