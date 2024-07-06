Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"
  
Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
--------------------------------------------------------------------------------------------------------------------------------------
  class Solution {
    public String longestCommonPrefix(String[] str) {
        StringBuilder ans = new StringBuilder();
         StringBuilder s1;
         if(str.length == 1){
            return str[0];
         }
         if(str.length>=2){
            ans = new StringBuilder(str[0]);
            for(int i=1; i<str.length; ++i){
                if(str[i].indexOf(ans.toString()) == 0){
                    continue;
                }
                else{
                    while(ans.length()!=0){
                        ans.deleteCharAt(ans.length()-1);
                        if(str[i].indexOf(ans.toString()) == 0){
                            break;
                        }
                    }
                }
            }
         }
         if(ans.length()==0)
            return "";
        return ans.toString();
    }
}
