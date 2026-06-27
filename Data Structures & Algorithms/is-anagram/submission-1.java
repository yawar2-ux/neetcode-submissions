class Solution {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
            } else {
                hm.put(s.charAt(i), 1);
            }
        }
        HashMap<Character, Integer> hm2 = new HashMap<>();
        for(int j=0; j<t.length(); j++){
            if(hm2.containsKey(t.charAt(j))){
                hm2.put(t.charAt(j), hm2.get(t.charAt(j)) +1);
            }else{
                hm2.put(t.charAt(j), 1);
            }
        }
        if(hm.equals(hm2)){
            return true;
        }
return false;
    }
}
