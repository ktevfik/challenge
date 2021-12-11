class Solution {
    public int reverse(int x) {
        StringBuilder sf = new StringBuilder();
        sf.append(x);

        for (int i = 0,j = sf.length() - 1;i < j;i++,j--) {
            char temp = sf.charAt(i);
            sf.setCharAt(i, sf.charAt(j));
            sf.setCharAt(j, temp);
        }
        if (sf.charAt(sf.length() - 1) == '-') {
            sf.deleteCharAt(sf.length() -1);
            sf.insert(0,"-");
        }
        int res = 0;
        try {
            res = Integer.parseInt(sf.toString());
        } catch (NumberFormatException err) {
            res = 0;
        }
        return res;
    }
}