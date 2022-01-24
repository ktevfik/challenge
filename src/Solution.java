class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        int i = 0,j = 1,t = 0;
        while (t < nums.length) {
            if (nums[t] >= 0) {
                arr[i] = nums[t];
                i += 2;
            } else {
                arr[j] = nums[t];
                j += 2;
            }
            t++;
        }
        return arr;
    }
}