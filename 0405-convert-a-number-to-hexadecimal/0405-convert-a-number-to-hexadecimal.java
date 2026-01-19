class Solution {
    public String toHex(int num) {
           if (num == 0) return "0";

        String hexChars = "0123456789abcdef";
        StringBuilder sb = new StringBuilder();

        while (num != 0) {
            int digit = num & 15;         
            sb.append(hexChars.charAt(digit));
            num = num >>> 4;               
        }

        return sb.reverse().toString();
    }
}