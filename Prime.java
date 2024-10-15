import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the no to check for prime: ");
        int no=sc.nextInt();
        for (int i=2;i<no;i++){
            
            if (no%i!=0){
                System.out.println("The no is prime no.");
                break;
            }

            else{
                System.out.println("The no is not a prime.");
                break;
            }
        }
    }
}
