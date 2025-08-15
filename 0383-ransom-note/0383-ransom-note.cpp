class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
       int count[26] = {0};
       for(char ch : magazine){
          count[ch - 'a']++;
       }
       for(char c : ransomNote) {
        if(count[c - 'a'] == 0) return false;
        count[c - 'a']--;
       }
       return true;
    }
};