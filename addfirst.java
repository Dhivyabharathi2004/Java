import java.util.LinkedList;


public class addfirst {
    public static void main(String[] args){
        LinkedList<String> name = new LinkedList<>();
        name.add("Dhivya");
        name.add("Hema");
        name.add("DD");
        name.addFirst("Dhivyabharathi");
        System.out.println(name);
    }
}
