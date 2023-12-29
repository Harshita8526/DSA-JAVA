class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        max=(nums[nums.length-1]-1)*(nums[nums.length-2]-1);
        return max;
    }
}
