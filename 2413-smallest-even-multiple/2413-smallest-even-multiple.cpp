class Solution {
public:
    int smallestEvenMultiple(int n) {
        int small = (n%2==0)?n:2*n;
        return small;
    }
};