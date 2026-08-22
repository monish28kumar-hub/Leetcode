class Solution {
public:
    bool checkDivisibility(int n) {
        int sum = 0, product = 1;
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        int divisor = sum + product;
        return divisor != 0 && n % divisor == 0;
    }
};