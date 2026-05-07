//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[]args){
        int[]arr={20,30,40,50,60,70};
        int key=20;
        boolean found=false;
        int n=arr.length;
        int i;
        for( i=0;i<n;i++){
            if(arr[i]==key){
                System.out.println("element is found");
                found=true;
            }

        }
        if(found!=true){
            System.out.println("Element cant found");
        }
    }
}