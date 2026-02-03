import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] nums = {4,6,12,65,2,11};
        for(int i=nums.length-1; i>=0;i--){
            for(int j=0;j<i;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
