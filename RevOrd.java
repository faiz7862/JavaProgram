import java.util.*;
public class RevOrd {
    public static void main(String[] args){
        int[] arr = {3,2,6,8,4};
        ArrayList <Integer> newArray = new ArrayList<>();
        for(int i = arr.length-1;i>=0;i--){
            newArray.add(arr[i]);
        }
        System.out.println(newArray);
    }
}
