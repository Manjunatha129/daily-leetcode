class Solution {
    public boolean isPalindrome(int x) {
        int OriginalNum = x;
        int Reverse = 0;

        while(x>0){
            Reverse = Reverse * 10 + x % 10;
            x = x/10;

        }

        if(Reverse == OriginalNum){
            return true;
        }
        else{
            return false;
        }

        
    }
}