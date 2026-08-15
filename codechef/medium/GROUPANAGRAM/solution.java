class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //write your code  here 
        Map<String, List<String>> groups = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedS = new String(chars);
            if (!groups.containsKey(sortedS)) {
                groups.put(sortedS, new ArrayList<>());
            }
            groups.get(sortedS).add(s);
        }
        return new ArrayList<>(groups.values());
    }
}