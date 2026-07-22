class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int total = 0;
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> element : map.entrySet()){
            if(element.getValue() == 1){
                total += element.getKey();

            }
        }
        return total;
    }
}