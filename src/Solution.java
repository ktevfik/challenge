import java.util.Arrays;

class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int counter = 0;
        Arrays.sort(seats);
        Arrays.sort(students);

        for (int i = 0;i < students.length;i++) {
            counter += Math.abs(students[i] - seats[i]);
        }

        return counter;
    }
}