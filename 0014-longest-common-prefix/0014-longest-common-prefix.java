class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";

        String base = strs[0];
        String str = "";

        for(int i = 0; i < base.length(); i++) {
            for(int j = 1; j < strs.length; j++) {
                if(strs[j].length() <= i || base.charAt(i) != strs[j].charAt(i))
                    return base.substring(0,i);
            }
        }
        return base;
    }
}