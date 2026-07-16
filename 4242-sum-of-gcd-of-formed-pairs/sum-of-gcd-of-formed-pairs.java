class Solution {
    public long gcdSum(int[] nums) {
        int maxElement = 0;
        int[] NewArray = new int[nums.length];
        
        // 1. Construct prefixGcd array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxElement) {
                maxElement = nums[i];
            }
            NewArray[i] = gcd(nums[i], maxElement);
        }
        
        // 2. Sort the array
        Arrays.sort(NewArray);
        
        // 3. Form pairs using two pointers and sum their GCDs
        int left = 0;
        int right = NewArray.length - 1;
        long sum = 0; // Changed to long to prevent overflow
        
        while (left < right) {
            sum += gcd(NewArray[left], NewArray[right]);
            left++;
            right--;
        }
        
        return sum;
    }
    
    // Correctly defined helper method outside of gcdSum
    private int gcd(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
}