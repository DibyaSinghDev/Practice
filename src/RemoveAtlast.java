import java.util.ArrayList;

public class RemoveAtlast {
    public static void main(String[]args){
        ArrayList<String>arr=new ArrayList<>();
        arr.add("Dibya");
        arr.add("Riya");
        arr.add("Little");
        arr.add("Chunu");
        int i;

        System.out.println("Array before removal");
        for(i=0;i<arr.size();i++){
            System.out.println(arr.get(i)+"");
        }
        arr.remove(arr.size()-1);

        System.out.println("Array after removal");
        for(i=0;i<arr.size();i++){
            System.out.println(arr.get(i)+"");
        }
    }
}
