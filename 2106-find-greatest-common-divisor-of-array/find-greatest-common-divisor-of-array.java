class Solution {
    public int findGCD(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for(int num : nums){
            if(num < smallest){
                smallest = num;
            }
            if(num > largest){
                largest = num;
            }

            
        }
        return gcd(smallest,largest);
        
    }

    private int gcd(int a,int b){
        while(b!=0){
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
}