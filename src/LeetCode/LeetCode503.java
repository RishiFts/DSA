package LeetCode;

import java.util.Arrays;

public class LeetCode503 {

    static void main() {

        LeetCode503 leetCode503 = new LeetCode503();
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(leetCode503.nextGreaterElements(nums)));
    }

    public int[] nextGreaterElements(int[] nums) {

        int num = nums[0];
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

        return nums;
    }
}
