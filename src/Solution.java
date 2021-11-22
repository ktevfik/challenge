class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0;i < mat.length;i++) {
            for (int j = 0;j < mat[i].length;j++) {
                if (i == j) {
                    sum += mat[i][j];
                    System.out.println(mat[i][j]);
                }

                if (i + j == mat.length) {
                    sum += mat[i][j];

                    System.out.println(mat[i][j]);

                }
            }
        }
        System.out.println(sum);
        int minusVal = (mat[0].length % 2 == 1 ? mat[mat.length / 2][mat[0].length / 2] : 0);
        return sum - minusVal;
    }
}