import java.util.*;
public class reverseNo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int y=number%10;
        while (y>1) {
             number/=10;
        }
        StringBuilder sb=new StringBuilder() ;
        sb.append(y);
        System.out.println(sb);
    }
}
