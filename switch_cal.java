import java.util.*;
public class switch_cal {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the x value:");
        int x= sc.nextInt();
        System.out.print("Enter the y value:");
        int y= sc.nextInt();
        System.out.print("Enter the operation to perform:");
        char ch=sc.next().charAt(0);

        switch (ch) {
            case '+':System.out.println("The sum is:"+(x+y));                
                break;
            case '-':System.out.println("The difference is:"+(x-y));                
                break;
            case '*':System.out.println("The product is:"+(x*y));                
                break;
            case '/':System.out.println("The division is:"+(x/y));                
                break;
            default:{
                System.out.println("plese select among / * - +");
            }
                break;
        }
    }
}
