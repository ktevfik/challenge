import java.util.*;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);

        int i = 0;
        int result = 0;
        while (i < s.length()) {
            if (i != s.length() - 1) {
                if (hashMap.get(s.charAt(i)) < hashMap.get(s.charAt(i + 1))) {
                    result += hashMap.get(s.charAt(i + 1)) - hashMap.get(s.charAt(i));
                    i++;
                } else {
                    result += hashMap.get(s.charAt(i));
                }
            } else {
                result += hashMap.get(s.charAt(i));
            }
            i++;
        }
        return result;
    }
}