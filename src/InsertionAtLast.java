import java.util.ArrayList;

public class InsertionAtLast {
    public static void main(String[]args){
        ArrayList<String>arr=new ArrayList<>();
        arr.add("My");
        arr.add("name");
        arr.add("is");
        arr.add("Dibya");

        int i;
        String ele="Thanks";

        System.out.println("Element before array");
        for(i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        arr.add(ele);
System.out.println("\n");
        System.out.println("Element after array");
        for(i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }

    }
}
