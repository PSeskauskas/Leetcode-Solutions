class Solution {
    public int reverse(int x) {
        int reversedNum = 0;
        while(x != 0) {
            if((reversedNum * 10) / 10 != reversedNum) {
                return 0;
            }
            reversedNum = (reversedNum * 10) + (x % 10);
            x = x / 10;
        }
        return reversedNum;
    }
}
