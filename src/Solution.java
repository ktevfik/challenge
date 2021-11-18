import java.util.ArrayList;

class Solution {
    public int subtractProductAndSum(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        while (n > 0) {
            arrayList.add(n % 10);
            n /= 10;
        }
        long product = arrayList.get(0);
        long sum = 0;
        for (int i = 0;i < arrayList.size();i++) {
            sum += arrayList.get(i);
            if (i != 0) product *= arrayList.get(i);
        }

        return (int)(product - sum);
    }
}