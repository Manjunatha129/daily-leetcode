class Solution {
    public boolean stoneGameIX(int[] stones) {
        int[] cnt = new int[3];
        for (int stone : stones) {
            cnt[stone % 3]++;
        }

        if (cnt[0] % 2 == 0) {
            // Even 0s: Alice wins if both remainder 1 and 2 stones exist
            return cnt[1] > 0 && cnt[2] > 0;
        } else {
            // Odd 0s: Alice wins if the difference between 1s and 2s is greater than 2
            return Math.abs(cnt[1] - cnt[2]) > 2;
        }
    }
}