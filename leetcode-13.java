class Solution {
    public int romanToInt(String s) {
        int conversion = 0;
        for(int i = 0; i < s.length(); i++) {
            char w = s.charAt(i);
            if(i < s.length() - 1) {
                char z = s.charAt(i + 1);
                if((w == 'I' && z == 'V') || (w == 'I' && z == 'X')) conversion -= 2;
                if((w == 'X' && z == 'L') || (w == 'X' && z == 'C')) conversion -= 20;
                if((w == 'C' && z == 'D') || (w == 'C' && z == 'M')) conversion -= 200;   
            }
            switch(w) {
                case 'I':
                    conversion += 1;
                    break;
                case 'V':
                    conversion += 5;
                    break;
                case 'X':
                    conversion += 10;
                    break;
                case 'L':
                    conversion += 50;
                    break;
                case 'C':
                    conversion += 100;
                    break;
                case 'D':
                    conversion += 500;
                    break;
                case 'M':
                    conversion += 1000;
                    break;
            }
        }
        return conversion;
    }
}
