class Solution {
    public String intToRoman(int num) {
        // Step 1: Create our parallel arrays (The Wallet)
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        // Step 2: Initialize an empty result builder
        StringBuilder result = new StringBuilder();
        
        // Step 3: Loop through the arrays from largest to smallest
        for (int i = 0; i < values.length; i++) {
            
            // Step 4: Keep using the current Roman numeral as long as it fits
            while (num >= values[i]) {
                result.append(symbols[i]);
                num -= values[i];
            }
        }
        
        // Step 5: Return the final Roman numeral string
        return result.toString();
    }
}