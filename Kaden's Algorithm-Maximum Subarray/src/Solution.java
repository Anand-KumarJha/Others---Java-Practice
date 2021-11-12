class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0],sum1 = nums[0];
        for(int i = 1; i < nums.length;i++){
            sum1 = Math.max(nums[i],sum1 + nums[i]);
            sum = Math.max(sum,sum1);
        }return sum;
    }
}