import java.util.Arrays;
public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
	
	System.out.print("Array : " + Arrays.toString(nums));

        // Rotate the array
        rotate(nums, k);

        // Print the rotated array
        System.out.print("\nNew Array : " + Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        // Normalize k to the array length
        k %= nums.length;

        // Reverse the entire array
	//  arrayname start  end of array
        reverse(nums, 0, nums.length - 1);

        // Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Reverse the remaining elements
        reverse(nums, k, nums.length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}