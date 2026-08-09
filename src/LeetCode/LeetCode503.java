package LeetCode;

import java.util.Arrays;

public class LeetCode503 {

    public static void main(String[] args) {

        LeetCode503 leetCode503 = new LeetCode503();
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(leetCode503.nextGreaterElements(nums)));
    }

    public int[] nextGreaterElements(int[] nums) {

       /* int num = nums[0];
        int i=0;
        while(true){
            int max = Integer.MIN_VALUE;
            for(int j=i+1; j<nums.length;j++){
                if(nums[j]>max){
                    max = Math.max(max, nums[j]);
                    nums[i] = max;
                }
                else if(nums[j] == max) {
                    nums[i] = -1;
                }
            }
            i++;
            if(i==nums.length){
                nums[nums.length-1]=max;
                break;
            }
        }

        return nums;*/

        int n = nums.length;
        int[] result = new int[n];

        Arrays.fill(result, -1);

        for (int i = 0; i < n; i++) {

            for (int j = 1; j < n; j++) {

                int index = (i + j) % n;

                if (nums[index] > nums[i]) {
                    result[i] = nums[index];
                    break;
                }
            }
        }

        return result;
    }
}
