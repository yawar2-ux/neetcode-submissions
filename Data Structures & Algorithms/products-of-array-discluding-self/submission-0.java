class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int count = 0;
        int multiple = 1;
        int arr1[] = new int[nums.length];
        for (int j = 0; j < nums.length; j++) {
            for (int i = 0; i < nums.length; i++) {
                if (i == count) {
                    continue;
                }
                multiple *= nums[i];
            }
            arr1[j] = multiple;
            multiple=1;

            count++;
        }
        return arr1;
    }
}
