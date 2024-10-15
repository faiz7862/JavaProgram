import java.util.ArrayList;
public class Arraylists {
    public static void main(String[] args){
        ArrayList <Integer> List = new ArrayList<>();

        // add an element to the array list

        List.add(2);
        List.add(4);
        List.add(6);
        List.add(5);
        System.out.println(List);

        // delete element from arraylist

        List.remove(2);
        System.out.println(List);

        //contains an element or to search in a array list

        System.out.println(List.contains(4));
        System.out.println(List.contains(38));

        // Insert at a certain index
        List.set(2,8);
        System.out.println((List));

        //get elemnt of the array list
        System.out.println(List.get(1));
    }
}
