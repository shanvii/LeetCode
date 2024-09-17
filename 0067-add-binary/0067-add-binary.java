class Solution {
    public String addBinary(String a, String b) {
        int la = a.length() - 1; 
        int lb = b.length() - 1; 

        int carry = 0;

        int length = Math.max(la + 1, lb + 1);
        
        StringBuilder ans = new StringBuilder();

        // Perform addition from the last bit to the first
        while (la >= 0 || lb >= 0 || carry > 0) {
            int sum = carry; // Start with the carry

            if (la >= 0) {
                sum += a.charAt(la) - '0'; // Convert char to int
                la--;
            }
            if (lb >= 0) {
                sum += b.charAt(lb) - '0'; // Convert char to int
                lb--;
            }

            // The binary digit to append
            ans.append(sum % 2); // Append the result of sum mod 2
            carry = sum / 2;     // Update carry for the next iteration
        }

        // Since we constructed the result backwards, reverse it before returning
        return ans.reverse().toString();
    }
}