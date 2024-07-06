Your friend is typing his name into a keyboard. Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times.
You examine the typed characters of the keyboard. Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.

Example 1:
Input: name = "alex", typed = "aaleex"
Output: true
Explanation: 'a' and 'e' in 'alex' were long pressed.

Example 2:
Input: name = "saeed", typed = "ssaaedd"
Output: false
Explanation: 'e' must have been pressed twice, but it was not in the typed output.
--------------------------------------------------------------------------------------------------------------------------------------------------
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        char[] n = name.toCharArray();
        char[] t = typed.toCharArray();
        int j = 0, i =0;
        char prev = n[0];
        char n1 = ' ', t1 = ' ';
        for(i = 0; i<t.length && j<n.length; ++i){
            t1 = t[i];
            n1 = n[j]; 
            if(n1 == t1){
                prev = n1;
                ++j;
            }
            else if(prev == t1){
                continue;
            }
            else{
                return false;
            }
        }
        if(j<n.length){
            return false;
        }
        while(i<t.length){
            if(prev == t[i]){
                ++i;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
