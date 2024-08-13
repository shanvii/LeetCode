class Solution {
    public int titleToNumber(String columnTitle) {
        char ch[] = columnTitle.toCharArray();
        int result = 0;
        for(int i = 0; i < ch.length; i++) {
            int num = ch[i] - 'A' + 1;
            result = result * 26 + num;
        }
        return result;
    }
}