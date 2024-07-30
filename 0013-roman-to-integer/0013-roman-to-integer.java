class Solution {
    public int romanToInt(String s) {

        int result = 0;

        Map<Character, Integer> hash = new HashMap<>();

        hash.put('M', 1000);
        hash.put('D', 500);
        hash.put('C', 100);
        hash.put('L', 50);
        hash.put('X', 10);
        hash.put('V', 5);
        hash.put('I', 1);

        // way-1
        // for (int i = 0; i < s.length() - 1; i++) {
        //     if (hash.get(s.charAt(i)) < hash.get(s.charAt(i + 1)))
        //         result -= hash.get(s.charAt(i));
        //     else
        //         result += hash.get(s.charAt(i));
        // }
        // return result + hash.get(s.charAt(s.length() - 1));

        // way-2
        s = s.replace("IV", "IIII");
        s = s.replace("IX", "VIIII");
        s = s.replace("XL", "XXXX");
        s = s.replace("XC", "LXXXX");
        s = s.replace("CD", "CCCC");
        s = s.replace("CM", "DCCCC");

        for(int i = 0; i < s.length(); i++) {
            result += hash.get(s.charAt(i));
        }

        return result;
        
    }
}