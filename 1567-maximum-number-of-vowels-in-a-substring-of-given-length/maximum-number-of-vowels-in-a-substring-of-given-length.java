class Solution {
    public int maxVowels(String s, int k) {
        int VowelsCount = 0;
        for(int i=0;i<k;i++){
            if(s.charAt(i) == 'a'|| s.charAt(i) == 'e' ||
                s.charAt(i) == 'i' ||
                s.charAt(i) == 'o' ||
                s.charAt(i) == 'u') {
                    VowelsCount++;
            }
        }

            int maxVowelsCount = VowelsCount;

            for(int j=k;j<s.length();j++){
                if(s.charAt(j-k) == 'a' ||
                s.charAt(j-k) == 'e' ||
                s.charAt(j-k) == 'i'||
                s.charAt(j-k) == 'o'||
                s.charAt(j-k) == 'u'){
                    VowelsCount--;
                }

                if(s.charAt(j) == 'a' ||
                s.charAt(j) == 'e' ||
                s.charAt(j) == 'i'||
                s.charAt(j) == 'o'||
                s.charAt(j) == 'u'){
                    VowelsCount++;
                } 
            

            maxVowelsCount = Math.max(maxVowelsCount,VowelsCount);            

        }
        return maxVowelsCount;
        
    
    }
}
