import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAtGivenPossition {
    public static void main(String[]args){
        ArrayList<Integer>arr=new ArrayList<>(Arrays.asList(10,20,30,40,50));
        int i;
        int pos=2;

        System.out.println("Element before Removal");
        for(i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+",");
        }
        arr.remove(pos-1);

System.out.println("\n");
        System.out.println("Element after removal");
        for(i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+",");
        }
    }
}
