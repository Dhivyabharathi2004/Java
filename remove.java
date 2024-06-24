import java.util.LinkedList;
public class remove{
    public static void main(String [] args){
        LinkedList <String> name= new LinkedList<>();
        name.add("Dhivya");
        name.add("Hema");
        name.add("DD");
        name.remove("Hema");
        System.out.println(name);

    }
}