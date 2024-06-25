import java.util.LinkedList;

public class getlast {
    public static void  main(String [] args){
        LinkedList<String> nw = new LinkedList<>();
        nw.add("Jio");
        nw.add("Airtel");
        nw.add("BSNL");
        System.out.println(nw);
        System.out.println("Last Element "+nw.getLast());

    }
}
