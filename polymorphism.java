public class polymorphism{
    // function overloading
    public static void fun(int count){
        System.out.println(count);
    }
    public void fun(){
        System.out.println("20");
    }
    public static void main(String[] args){
        
    }

}
class poly extends polymorphism{
    public void fun(){
        System.out.println("30");
    }
}