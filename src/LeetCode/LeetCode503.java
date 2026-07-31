package LeetCode;

public class LeetCode503 {

    static void main() {

        LeetCode503 leetCode503 = new LeetCode503();
        int[] nums = {1,2,1};
        System.out.println(leetCode503.nextGreaterElements(nums));
    }

    public int[] nextGreaterElements(int[] nums) {

        int num = nums[0];
        int i=0;
        for(i+1; i < nums.length-1; i++)
        {
            int max = Integer.MIN_VALUE;
            max = Math.max(num,max);

            if(nums[i] < nums[i+1])
            {
                nums[i] = nums[i+1];
            }
            else
            {
                nums[i] = -1;
            }
        }

        return nums;

    }
}
