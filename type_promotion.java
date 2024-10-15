public class type_promotion {
    public static void main(String[] args){
        byte a=2;
        // byte b= a*4;
        byte b= (byte) (a*4);
        System.out.print(b);
}
    }
