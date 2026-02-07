import java.util.*;
class InsertionSort{
    static void insertionSort(){
        int[] nums = {3,5,2,6,4,8};
        for(int i=0;i<nums.length;i++){
            int j = i;
            while(j>0 && nums[j-1]> nums[j]){
                int temp = nums[j-1];
                nums[j-1] = nums[j];
                nums[j] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args){
        insertionSort();
    }
}