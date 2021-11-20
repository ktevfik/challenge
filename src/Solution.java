class Solution {
    public String toLowerCase(String s) {
        StringBuilder sf = new StringBuilder();

        for (int i = 0;i < s.length();i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                sf.append((char)(s.charAt(i) + 32));
            } else {
                sf.append(s.charAt(i));
            }
        }
        return sf.toString();
    }
}