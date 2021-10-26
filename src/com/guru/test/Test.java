package com.guru.test;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {

		int[] nums = new int[] { 4, 5, 6, 7, 0, 1, 2 };
		int target = 0;
//	System.out.println(search(nums, target));
		List<Integer> intlist = new ArrayList<Integer>();
		intlist.add(4);
		intlist.add(5);
		intlist.add(6);
		intlist.add(7);
		intlist.add(0);
		intlist.add(1);
		intlist.add(2);

		System.out.println(search(intlist, target));

	}

	public static int search(List<Integer> INTLIST, int target) {
		int[] nums = INTLIST.stream().mapToInt(i -> i).toArray();
		int left = 0;
		int right = nums.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			// check for mid
			if (nums[mid] == target)
				return mid;
			// check if first half is in order
			if (nums[left] <= nums[mid]) {
				// check if target is in first half or not
				if (target >= nums[left] && target < nums[mid])
					right = mid - 1;
				else
					left = mid + 1;
			}
			// second half is in order
			else {
				// target is in second half or not
				if (target > nums[mid] && target <= nums[right])
					left = mid + 1;
				else
					right = mid - 1;
			}
		}
		return -1;
	}

}
