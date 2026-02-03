import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] nums = {4,6,12,65,2,11};
        for(int i=0;i<nums.length-1;i++){
            int mim = i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[mim] > nums[j]){
                    mim=j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[mim];
            nums[mim] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
