class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("[.\\s]");
        StringBuilder sb;
        for(int i=0; i<words.length; ++i){
            sb = new StringBuilder(words[i]);
            sb.reverse();
            words[i] = sb.toString();
        }
        return String.join(" ", words);
    }
}
