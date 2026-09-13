class Solution {
  public:
    vector<int> wordLengths(string &s) {
        // code here
        vector<int> ans;
                int count = 0;

                for (int i = 0; i < s.length(); i++) {
                    if (s[i] == ' ') {
                        ans.push_back(count);
                        count = 0;
                    } else {
                        count++;
                    }
                }

                ans.push_back(count);

                return ans;
        
    }
};