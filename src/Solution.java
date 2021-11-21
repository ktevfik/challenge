class Solution {
    public String replaceDigits(String s) {
        // even letter - digit odd
        StringBuilder sf = new StringBuilder();

        for (int i = 0; i < s.length();i++) {
            if (Character.isDigit(s.charAt(i))) {
                sf.append((char) (s.charAt(i - 1) + Character.getNumericValue(s.charAt(i))));
            } else {
                sf.append(s.charAt(i));
            }
        }
        return sf.toString();
    }
}