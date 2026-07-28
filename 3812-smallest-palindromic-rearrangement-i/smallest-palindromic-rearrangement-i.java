class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int halfLen = n / 2;
        
        // 1. Extract the first half into a character array
        char[] half = new char[halfLen];
        for (int i = 0; i < halfLen; i++) {
            half[i] = s.charAt(i);
        }
        
        // 2. Sort the first half to get lexicographically smallest order
        Arrays.sort(half);
        
        // 3. Construct the full palindrome using a char array
        char[] result = new char[n];
        
        // Fill the left side with the sorted characters
        // and mirror them directly onto the right side
        for (int i = 0; i < halfLen; i++) {
            result[i] = half[i];
            result[n - 1 - i] = half[i];
        }
        
        // 4. Place the middle character if the length is odd
        if (n % 2 != 0) {
            result[halfLen] = s.charAt(halfLen);
        }
        
        return new String(result);
    }
}