class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        int low = 0;
        int high = str.length() - 1;

        while(low < high) {
            if(!Character.isLetterOrDigit(str.charAt(low))) {
                low++;
                continue;
            }
            if(!Character.isLetterOrDigit(str.charAt(high))) {
                high--;
                continue;
            }
            if(str.charAt(low) != str.charAt(high))
                return false;
            low++;
            high--;            
        }
        return true;
    }
}