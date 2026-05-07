import java.util.ArrayList;
import java.util.Arrays;

public class InsertAtFirst {
   public static void main(String[]args){
       ArrayList<Integer>arr=new ArrayList<>(Arrays.asList(10,20,30,40,50));
       int i;

       arr.set(0,11);

       for(i=0;i<arr.size();i++){
           System.out.print(arr.get(i)+",");
       }
   }
}
