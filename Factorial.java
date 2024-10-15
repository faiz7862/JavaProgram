import java.util.*;
public class Factorial {
    public static void fact(int number){
        int factVal=1;
        for (int i=1;i<=number;i++){
            factVal*=i;
        }
        System.out.println("The factorial is: "+factVal);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find the factorial: ");
        int number=sc.nextInt();
        fact(number);
    }
}
