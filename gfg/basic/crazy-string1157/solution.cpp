class Solution {
  public:
    string altCase(string& s) {
        bool firstLower = (s[0] >= 'a' && s[0] <= 'z');

                for (int i = 0; i < s.length(); i++) {
                    if (firstLower) {
                        if (i % 2 == 0)
                            s[i] = tolower(s[i]);
                        else
                            s[i] = toupper(s[i]);
                    } else {
                        if (i % 2 == 0)
                            s[i] = toupper(s[i]);
                        else
                            s[i] = tolower(s[i]);
                    }
                }

                return s;
        
    }
};