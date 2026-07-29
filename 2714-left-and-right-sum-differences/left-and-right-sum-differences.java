class Solution {
    public int[] leftRightDifference(int[] nums) {

        int totalsum = 0;
        int leftsum = 0;

        for(int num : nums){
            totalsum+=num;
        }
        int ans[] = new int[nums.length];

        for(int i=0;i<ans.length;i++){
            int rightsum = totalsum - leftsum - nums[i];
        
            ans[i] = Math.abs(leftsum - rightsum);

            leftsum += nums[i];
        }
        return ans;
    }
}
    