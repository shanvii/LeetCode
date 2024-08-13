class Solution {
    public String toLowerCase(String s) {
        StringBuilder res = new StringBuilder();
        for(char c: s.toCharArray()) {
            if(c >= 'A' && c <= 'Z') {
                c = (char) (c + 32);
            }
            res.append(c);
        }
        return res.toString();
    }
}

// class Solution {
//     public String toLowerCase(String s) {
//         String res = "";
//         for(int i = 0; i < s.length(); i++) {
//             if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
//                 res += (char) (s.charAt(i) + 32);
//             else
//                 res += s.charAt(i);
//         }
//         return res;
//     }
// }

// class Solution {
//     public String toLowerCase(String s) {
//         char ch[] = s.toCharArray();
//         for(int i = 0; i < ch.length; i++) {
//             if(ch[i] >= 65 && ch[i] <= 90)
//                 ch[i] =(char) (ch[i] + 32);
//         }
//         return String.valueOf(ch);
//     }
// }