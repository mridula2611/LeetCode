class Solution {
public:
    bool isPalindrome(string s) {
        string a1="";
        for(char ch:s){
            if(isalnum(ch)){
                a1+=tolower(ch);
            }
        }
        string rev=a1;
        reverse(a1.begin(),a1.end());
        if(rev==a1){
            return true;
        }
        else{
            return false;
        }
    }
};