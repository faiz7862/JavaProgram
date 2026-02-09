public class DecimalToBinary {
    public static void main(String[] args) {
        int num = 1;
        String bin = "";
        while(num>0){
            bin += num%2;
            num /= 2;
        }
        System.out.println(bin);
    }
}
