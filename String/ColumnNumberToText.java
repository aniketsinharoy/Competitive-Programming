Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 

Example 1:
Input: columnNumber = 1
Output: "A"

Example 2:
Input: columnNumber = 28
Output: "AB"

Example 3:
Input: columnNumber = 701
Output: "ZY"

Constraints:
1 <= columnNumber <= 231 - 1
----------------------------------------------------------------------------------------------------------------------
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder columnTitle = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;  // Adjust to 0-based index
            char ch = (char) ('A' + columnNumber % 26);
            columnTitle.insert(0, ch);
            columnNumber /= 26;
        }
        return columnTitle.toString();
    }
}
