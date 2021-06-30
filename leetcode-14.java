class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++) {
            prefix = findPrefix(prefix, strs[i]);
        }
        return prefix;
    }
    public static String findPrefix(String s, String c) {
        StringBuilder common = new StringBuilder();
        int i = 0, j = 0;
        while(i < s.length() && j < c.length()) {
            if(s.charAt(i) != c.charAt(j)) {
                break;
            } 
            common.append(s.charAt(i));
            i++;
            j++;
        }
        return common.toString();
    }
}
