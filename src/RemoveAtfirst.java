import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAtfirst {
    public static void main(String[]args){
        ArrayList<Integer>arr=new ArrayList<>(10);
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        int i;


        System.out.print("Array before removale");
        for(i=0;i<arr.size();i++){
            System.out.println(arr.get(i) +"");
        }
        arr.remove(0);

        System.out.print("Array after removal");
        for(i=0;i<arr.size();i++){
            System.out.println(arr.get(i)+"");
        }
    }

}
