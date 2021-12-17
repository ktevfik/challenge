class Solution {
    public int countPoints(String rings) {
        int[][] arr = new int[201][3];
        int result = 0;
        for (int i = 0;i < rings.length();i += 2) {
            if (rings.charAt(i) == 'R') {
                arr[charToInt(rings.charAt(i + 1))][0]++;
            } else if (rings.charAt(i) == 'G') {
                arr[charToInt(rings.charAt(i + 1))][1]++;
            } else if (rings.charAt(i) == 'B') {
                arr[charToInt(rings.charAt(i + 1))][2]++;
            }
        }

        for (int i = 0;i < arr.length;i++) {
            if (arr[i][0] > 0 && arr[i][1] > 0 && arr[i][2] > 0) {
                result++;
            }
        }

        return result;
    }

    public int charToInt(char a) {
        return Integer.parseInt(String.valueOf(a));
    }
}