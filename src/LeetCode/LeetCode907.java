package LeetCode;

public class LeetCode907 {


    static void main() {

        LeetCode907 leetCode907 = new LeetCode907();
        System.out.println(leetCode907.sumSubarrayMins(new int[]{11,81,94,43,3}));
    }

    public int sumSubarrayMins(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            int min = Integer.MAX_VALUE;

            for (int j = i; j < arr.length; j++) {

                min = Math.min(min, arr[j]);

                // ab subarray arr[i...j] ka minimum mil gaya
                sum += min;
            }
        }

        return sum;

    }
}
