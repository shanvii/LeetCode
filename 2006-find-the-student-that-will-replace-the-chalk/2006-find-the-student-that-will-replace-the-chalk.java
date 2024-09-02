class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum[] = new long[chalk.length];
        sum[0] = chalk[0];
        for(int i = 1; i < chalk.length; i++) {
            sum[i] = sum[i-1] + chalk[i];
        }
        k %= sum[chalk.length - 1];
        int low = 0, high = chalk.length - 1;
        while(low < high) {
            int mid = low + (high - low) / 2;
            if(sum[mid] == k)   return mid+1;
            if(sum[mid] > k)  high = mid;
            else low = mid + 1;
        }
        return low;
    }
}

// class Solution {
//     public int chalkReplacer(int[] chalk, int k) {
//         long sum = 0;
//         for(int c: chalk)   sum += c;
//         k %= sum;
//         for(int i = 0; i < chalk.length; i++) {
//             if(chalk[i] > k)    return i;
//             k -= chalk[i];
//         }
//         return -1;
//     }
// }