class Solution {
  public:
    int countVowels(string &s) {
        set<char> vowels;

                for (char ch : s) {
                    if (ch == 'a' || ch == 'e' || ch == 'i' ||
                        ch == 'o' || ch == 'u') {
                        vowels.insert(ch);
                    }
                }

                return vowels.size();
        
    }
};