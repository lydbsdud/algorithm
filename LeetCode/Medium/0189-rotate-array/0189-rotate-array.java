class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length);
        reverse(nums, 0, k);
        reverse(nums, k, nums.length);
    }
    public void reverse(int[] nums, int start, int end){
        int l = start;
        int r = end-1;
        while(l < r){
            int n = nums[l];
            nums[l] = nums[r];
            nums[r] = n;
            l++;
            r--;
        }
    }
}