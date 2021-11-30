class Solution {
    public boolean halvesAreAlike(String s) {
        char[] arr = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        StringBuilder sf1 = new StringBuilder();
        StringBuilder sf2 = new StringBuilder();

        for (int i = 0; i < s.length() / 2; i++) {
            sf1.append(s.charAt(i));
        }
        for (int i = s.length() / 2; i < s.length(); i++) {
            sf2.append(s.charAt(i));
        }


        int cVowel1 = 0;
        int cVowel2 = 0;

        String s1 = sf1.toString();
        String s2 = sf2.toString();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < s1.length(); j++) {
                if (arr[i] == s1.charAt(j)) cVowel1++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (arr[i] == s2.charAt(j)) cVowel2++;
            }
        }

        return cVowel1 == cVowel2;
    }
}