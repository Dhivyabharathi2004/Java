import java.util.LinkedList;
class GetFirst {
    public static void main(String[] args){
       LinkedList <String> nw = new LinkedList<>();
       nw.add("Jio");
       nw.add("Airtel");
       nw.add("BSNL");
       System.out.println(nw);
       System.out.println("First Element"+nw.getFirst());

    }
    
}
/*
 * OUTPUT
 * [Jio,Airtel,BSNL]
 * First Element JIo
 */