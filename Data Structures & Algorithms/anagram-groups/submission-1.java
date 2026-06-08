class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String str1 = new String(ch);
            if (hm.containsKey(str1)) {
                hm.get(str1).add(strs[i]);
            } else {
                List<String> li = new ArrayList<>();
                li.add(strs[i]);
                hm.put(str1, li);
            }
        }
        return new ArrayList<>(hm.values());
    }
}
