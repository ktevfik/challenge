class Solution {
    public int mostWordsFound(String[] sentences) {
        int result = 0;
        for (int i = 0;i < sentences.length;i++) {
            String[] strs = sentences[i].split(" ");

            if (strs.length > result) result = strs.length;
        }
        return result;
    }
}