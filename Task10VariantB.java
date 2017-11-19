//Task 10: find first positive number and its index

package by.http.lesson3;

public class Task10VariantB {

	public static void main(String[] args) {

		int[] nums = { -3, -80, 5, 0, 5, -7, 9, -15, 13 };
		int count = 0;
		int t;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				count++;
				if (count == 1) {
					t = nums[i];
					System.out.println("First positive number is " + t + " and its index in the collection is " + i);
				}
			}
		}
	}

}
