import java.util.*;
public class pattern {
    
    public static void main(String[] args) {
        Scanner  sc= new Scanner(System.in);
        System.out.println("enter the rows");
        int rows =sc.nextInt();
        int i,j;
        for(i=1;i<=rows;i++){
            for(j=1;j<=i;j++){
                System.out.print(i +"");
                
         
            }
            System.out.println("");
        }
        
    }
}
