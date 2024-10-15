
import java.util.*;
public class tax {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the income:");
        int amount=sc.nextInt();
        if (amount<500000){
            int tax1=amount;
            System.out.println("The income after tax charge:"+tax1);
        }
        else if(amount>=50000 && amount<1000000){
            double tax1=amount*0.2;
            System.out.println("The income after tax charge:"+tax1);
        }
        else if(amount>=1000000){
            double tax1=amount*0.3;
            System.out.println("The income after tax charge:"+tax1);
        }
    }
}