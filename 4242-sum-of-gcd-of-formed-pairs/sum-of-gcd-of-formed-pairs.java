class Solution {
    public long gcdSum(int[] nums) {
        int maxElement  = 0;
        int NewArray[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i] > maxElement){
                maxElement = nums[i];

            }
            NewArray[i] = gcd(nums[i] , maxElement);

        }
        Arrays.sort(NewArray);
    

        int left = 0;
        int right = NewArray.length-1;
        long sum = 0;
        while(left < right){
            sum += gcd(NewArray[left],NewArray[right]);
            left++;
            right--;

        }
        return sum;
    }
       private int gcd(int a,int b){
            while(b != 0){
                int reminder = a % b;
                a = b;
                b = reminder;
            }
            return a;
        }
}