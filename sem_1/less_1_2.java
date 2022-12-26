/*
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.
 */
public class less_1_2 {
    public static void main(String[] args) {
        // подскажите как вызывать функцию с массивом???
        System.out.println(removeElement([3,2,2,3],3));
    }

    public static int removeElement(int[] nums, int val) {
        // Counter for keeping track of elements other than val
        int count = 0;
        // Loop through all the elements of the array
        for (int i = 0; i < nums.length; i++) {
            // If the element is not val
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}
