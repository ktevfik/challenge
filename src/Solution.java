import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        // plance coordinates - points
        // circle x,y, Radius - queries

        ArrayList<Integer> res = new ArrayList<>();
        for (int[] q : queries) {
            int cnt = 0, rr = q[2] * q[2];
            for (int[] p : points)
            cnt += ((q[0] - p[0]) * (q[0] - p[0]) + (q[1] - p[1]) * (q[1] - p[1]) <= rr) ? 1 : 0;
            res.add(cnt);
        }

        return res.stream().mapToInt(i -> i).toArray();
    }


}