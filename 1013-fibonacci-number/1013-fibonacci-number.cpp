class Solution {
public:
    int fib(int n) {
        if(n <= 1) return n;
        int cur = 0;
        int pre = 1;
        int prev = 0;
        for(int i= 2; i<=n; i++)
        {
            cur = prev + pre;
            prev = pre;
            pre = cur;
        }return cur;
    }
};