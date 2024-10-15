import java.util.*;

public class arrayManipulation {
    public static void candies(){
      
      Scanner sc= new Scanner(System.in);
      System.out.print("Enter the no of test cases: ");
      int testCase = sc.nextInt();      
      
      while(testCase>=1){
          System.out.print("Enter the size of array candies: ");
          int boxes = sc.nextInt();
          System.out.print("Enter the array candies: ");
          int [] inputCandies = new int[boxes];

          for(int j=0;j<boxes;j++){
            inputCandies[j] = sc.nextInt();
          }

          for(int k=0;k<boxes;k++){
            int sum=0;
            if(k==0 && k==1){
                sum = inputCandies[k]+inputCandies[k+1];
            }
            else{
                int minTime  = sum+inputCandies[k];
                System.out.println(minTime);
            }
            
          }
          testCase--;   
      }
      
    }
    
    public static void main(String[] args) {
       candies();
  }
}