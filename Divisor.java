import java.util.ArrayList;

public class Divisor {
    public static void main(String[] args) {
        int number = 21;
        ArrayList<Integer> factor = new ArrayList<>();
        for(int i=1;i*i<=number;i++){
            if (number%i==0){
                factor.add(i);
                if(i!=number/i){

                    factor.add(number/i);
                }
               
            }
        }
        System.out.println(factor);
    }
}
