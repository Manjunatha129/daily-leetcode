class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {

        Set<Integer> res = new HashSet<>();

        for (int[] triplet : triplets) {
            int x = triplet[0];
            int y = triplet[1];
            int z = triplet[2];

            if (x > target[0] || y > target[1] || z > target[2]) {
                continue;
            }

            if (x == target[0]) {
                res.add(0);
            }

            if (y == target[1]) {
                res.add(1);
            }

            if (z == target[2]) {
                res.add(2);
            }
        }

        return res.size() == 3;
    }
        
    
}