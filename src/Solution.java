class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");

        StringBuilder sf = new StringBuilder();

        for (int i = 0;i < arr.length;i++) {
            for (int k = arr[i].length() - 1;k >= 0;k--) {
                sf.append(arr[i].charAt(k));
            }

            if (i != arr.length - 1) {
                sf.append(' ');
            }
        }
        return sf.toString();
    }
}