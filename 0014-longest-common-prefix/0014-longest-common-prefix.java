class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);
        for(int i = 0; i < Math.min(strs[0].length(), strs[strs.length - 1].length()); i++) {
            if(strs[0].charAt(i) != strs[strs.length - 1].charAt(i))    return ans.toString();
            ans.append(strs[0].charAt(i));
        }
        return ans.toString();
    }
}

// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//         if(strs.length == 0)
//             return "";

//         String base = strs[0];

//         for(int i = 0; i < base.length(); i++) {
//             for(int j = 1; j < strs.length; j++) {
//                 if(strs[j].length() <= i || base.charAt(i) != strs[j].charAt(i))
//                     return base.substring(0,i);
//             }
//         }
//         return base;
//     }
// }