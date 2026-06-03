class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for(String str:strs){
            char arr[]= str.toCharArray();
            Arrays.sort(arr);
            String str1= new String(arr);
            if(hm.containsKey(str1)){
                hm.get(str1).add(str);
            }
            else{
                List<String> li = new ArrayList<>();
                li.add(str);
                hm.put(str1, li);
            }
        }
        return new ArrayList<>(hm.values());
    }
}
