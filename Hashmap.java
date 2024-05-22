import java.util.*;
class A{
    public static void main(String args[]){
        HashMap<String,Integer> a1=new HashMap<>();
        a1.put("Sai",1);
        a1.put("Rohit",2);
        a1.put("Surya",3);
        a1.put("Kohli",4);
        a1.put("Sachin",5);
        System.out.println(a1.size());
        System.out.println(a1);
       System.out.println(a1.containsKey("Sai"));
       System.out.println(a1.get("Rohit"));
       System.out.println(a1.isEmpty());
       a1.remove("Sai");
       System.out.println(a1);
       a1.clear();
       System.out.println(a1.size());
       System.out.println(a1.containsKey("sai"));
       System.out.println(a1.isEmpty());
    }
}