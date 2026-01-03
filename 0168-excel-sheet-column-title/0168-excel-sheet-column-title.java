class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder s = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            int rem = columnNumber % 26;
            char ch = (char) ('A' + rem);
            s.insert(0,ch);
            columnNumber/=26;
        }
        return s.toString();
    }
}