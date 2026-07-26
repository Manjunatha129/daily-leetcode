class Solution {
    public int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

         // Initialize min values to the largest possible integer
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int num : nums){
            if(num > max1){
                max3 = max2;
                max2 = max1;
                max1 = num;


            }else if(num > max2){
                max3 = max2;
                max2 = num;
            }else if(num > max3){
                max3 = num;
            }
            if(num < min1){
                min2 = min1;
                min1 = num;
            }else if(num < min2){
                min2 = num;
            }

           
        
        }
        // Return the maximum of:
        // 1. Product of 3 largest numbers
        // 2. Product of 2 smallest (most negative) numbers and the largest number
        return Math.max(max1 * max2 * max3, min1 * min2 * max1);

        
    }
}