package com.app;

public class Solution {

    public int addDigits(int num) {
        int sum = getSum(num);
        while (sum >= 10) {
            sum = getSum(sum);
        }
        return sum;
    }

    int getSum(int num) {
        int sum = 0;
        while (num != 0) {
            int t = num % 10;
            sum += t;
            num /= 10;
        }
        return sum;
    }

    public int addDigitsRec(int num) {
        return (num < 10) ? num : addDigitsRec(getSum(num));
    }
}
