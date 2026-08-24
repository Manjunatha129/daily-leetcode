class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int windowSum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {

            // Expand the window
            windowSum += nums[right];

            // Shrink while the window is valid
            while (windowSum >= target) {

                // Update minimum length
                minLength = Math.min(minLength, right - left + 1);

                // Remove left element
                windowSum -= nums[left];

                // Move left
                left++;
            }
        }

        // If no valid subarray exists
       return minLength == Integer.MAX_VALUE ? 0 : minLength;

        // if(minLength == nums.length+1){
        //     return 0;
        // }else{
           // return minLength;
        //}
    }
}