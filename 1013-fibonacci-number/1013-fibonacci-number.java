class Solution {
    public int fib(int n) {
        if(n <= 1) return n;
        int f[] = new int[n + 1];

        f[0] = 1;
        f[1] = 1;

        for (int i = 2; i <= n; i++)
            f[i] = f[i - 1] + f[i - 2];

        return f[n-1];
    }
}

// class Solution {
//     int[] fib_nums = {
//             0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181,
//             6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040,
//             1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986,
//             102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903
//     };

//     public int fib(int n) {
//         return fib_nums[n];
//     }
// }

// class Solution {
//     public int fib(int n) {
//         if (n <= 1)
//             return n;
//         int a = 0, b = 1;
//         int sum = 0;
//         for (int i = 2; i <= n; i++) {
//             sum = a + b;
//             a = b;
//             b = sum;
//         }
//         return sum;
//     }
// }

// class Solution {
//     public int fib(int n) {
//         int sum = 0;
//         if (n <= 1)
//             return n;
//         return fib(n - 1) + fib(n - 2);
//     }
// }