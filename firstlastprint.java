import java.util.LinkedList;
public class firstlastprint{
    public static void main(String [] args){
        LinkedList<String> name = new LinkedList<>();
        name.add("Dhivya");
        name.add("Hema");
        name.add("DD");
        System.out.println(name.getFirst());
        System.out.println(name.getLast());

    }
}