package by.http.lesson3;

public class Task10 {

	public static void main(String[] args) {
		int[] nums = { -3, -80, -5, 0, -5, -7, 9, 9, 13 };

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				System.out.println("First positive number is " + nums[i] + " and its index in the collection is " + i);
				break;
			}

		}

	}

}
