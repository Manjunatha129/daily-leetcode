class Solution {
   public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // Sort the characters of the string to create a key
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);

            // Add the original string to the corresponding key list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}