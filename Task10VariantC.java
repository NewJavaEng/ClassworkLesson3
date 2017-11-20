//Task 10: find first positive number and its index

package by.http.lesson3;

public class Task10VariantC {

	public static void main(String[] args) {

		int[] nums = { -3, -80, -5, 0, 5, -7, 9, -15, 13 };
		int i;

		for (i = 0; i < nums.length && nums[i] <= 0; ++i)
			;
		{
			if (i == nums.length) {
				System.out.println("No positive number!");
			} else {
				System.out.println("nums[" + i + "] = " + nums[i]);
			}
		}
	}

}
