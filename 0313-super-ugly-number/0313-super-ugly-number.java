class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
           int k = primes.length;
        long[] ugly = new long[n];   // use long
        ugly[0] = 1;

        int[] idx = new int[k];

        for (int i = 1; i < n; i++) {
            long next = Long.MAX_VALUE;   // use long

            for (int j = 0; j < k; j++) {
                next = Math.min(next, ugly[idx[j]] * primes[j]);
            }

            ugly[i] = next;

            for (int j = 0; j < k; j++) {
                if (ugly[idx[j]] * primes[j] == next) {
                    idx[j]++;
                }
            }
        }

        return (int) ugly[n - 1];  
        
    }
}