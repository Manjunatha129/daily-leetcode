
class Solution {
    public boolean isGood(int[] nums) {
        int len = nums.length;
        
        // base[n] must have at least 2 elements (e.g., base[1] = [1, 1])
        if (len < 2) {
            return false;
        }

        Arrays.sort(nums);
        int n = len - 1; // Maximum expected element

        // Check elements from index 0 to n - 2 (should be 1, 2, ..., n - 1)
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != i + 1) {
                return false;
            }
        }

        // The last two elements (at index n - 1 and n) must both equal n
        return nums[n - 1] == n && nums[n] == n;
    }
}