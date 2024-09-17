class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while(columnNumber > 0) {
            int index = (columnNumber - 1) % 26;
            result.append((char)(index + 'A'));
            columnNumber = (columnNumber - 1) / 26;
        }
        return result.reverse().toString();
    }
}