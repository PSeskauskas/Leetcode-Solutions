class Solution {
    public boolean isAnagram(String s, String t) {
        /* If the strings aren't the same length, they cannot be anagrams */
        if(s.length() != t.length()) {
            return false;
        }
        /* Map all of the first string with the corresponding count of each character */
        Map<Character, Integer> sMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        /* Map all of the second string with the corresponding count of each character */
        Map<Character, Integer> tMap = new HashMap<>();
        for(int i = 0; i < t.length(); i++) {
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        }
        /* Return true if both maps are equal, else, return false */
        return sMap.equals(tMap);
    }
}
