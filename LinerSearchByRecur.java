

import java.util.*;
public class LinerSearchByRecur {
    public static boolean recSearch(int arr[], int key, int i)
    {

        if(i == arr.length)
        {
            return false;
        }
        else{
            if(arr[i] == key)
            {
               
                return true;
            }
        }
        return recSearch(arr,key,i+1);
    }
	public static void main(String[] args) 
	{
		int arr[] = {12,5,6,8,9,7,54,112};
		
		int key = 54;
		
		if(recSearch(arr, key, 0))
		    System.out.println("Element found " );
		else
		    System.out.println("Element not found");
	}
}