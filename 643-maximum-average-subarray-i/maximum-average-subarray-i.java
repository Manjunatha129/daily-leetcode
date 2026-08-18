class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int WindowSum = 0;
        for(int i=0;i<k;i++){
            WindowSum += nums[i];
        }

        int maxSum = WindowSum;

        for(int j=k;j<nums.length;j++){
            WindowSum = WindowSum - nums[j-k]+nums[j];
            maxSum = Math.max(maxSum,WindowSum);
        }
        return (double) maxSum/k;
        
    }
}