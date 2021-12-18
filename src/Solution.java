import java.util.Arrays;

class Solution {
    public String sortString(String s) {
        int[] arr = new int[26];
        for (int i = 0;i < s.length();i++) {
            arr[s.charAt(i) - 97]++;
        }

        StringBuilder sf = new StringBuilder();
        while (sf.length() != s.length()) {
            for (int i = 0;i < arr.length;i++) {
                if (arr[i] > 0) {
                    sf.append((char) (97 + i));
                    arr[i]--;
                }
            }
            for (int i = arr.length - 1;i >= 0;i--) {
                if (arr[i] > 0) {
                    sf.append((char) (97 + i));
                    arr[i]--;
                }
            }
        }

        return sf.toString();
    }
}