class Solution {
    private int balls = 0;
    private int steps = 0;

    public int[] minOperations(String boxes) {
        int[] leftCount = new int[boxes.length()];
        int[] rightCount = new int[boxes.length()];
        int[] hopCount = new int[boxes.length()];

        for(int i = 0; i < leftCount.length; i++) {
            ballCounter(boxes.charAt(i), i, leftCount);
        }

        steps = balls = 0;
        for(int i = rightCount.length - 1; i > -1; i--) {
            ballCounter(boxes.charAt(i), i, rightCount);
        }

        for(int i = 0; i < hopCount.length; i++) {
            hopCount[i] = leftCount[i] + rightCount[i];
        }

        return hopCount;
    }

    private void ballCounter(char hasBall, int index, int[]counter) {
        steps += balls;
        balls += hasBall == '1' ? 1 : 0;
        counter[index] = steps;
    }
}

class OrderedStream {
    int ptr;
    String[] res;
    
    public OrderedStream(int n) {
        ptr = 0;
        res = new String[n];
    }
    
    public List<String> insert(int id, String value) {
        List<String> list = new ArrayList<>();
        
        res[id - 1] = value;
        while (ptr < res.length && res[ptr] != null) {
            list.add(res[ptr]);
            ptr++;
        }
        
        return list;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */