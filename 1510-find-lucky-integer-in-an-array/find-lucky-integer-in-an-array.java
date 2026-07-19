class Solution {
    public int findLucky(int[] arr) {

        // lucky number : oka number frequency and value same athey {2:2} daanni lucky number antamm

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }

        }

        int maximumInteger = -1;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){

            int key = entry.getKey(); 
            int value = entry.getValue();
            if(key == value){

                if(key > maximumInteger){
                    maximumInteger = entry.getKey();
                }
                
            }
            
        }
       return maximumInteger;
        
        
    }
}