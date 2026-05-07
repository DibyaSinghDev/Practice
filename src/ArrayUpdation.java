public class ArrayUpdation {
    public static void main(String[] args) {
        int[]arr={100,101,102,103,104,105};
        System.out.println("Array before updation:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        int indexPos=2;
        int element=110;
        arr[indexPos]=element;
        System.out.println("Array after updation:");
        for(int no : arr){
            System.out.println(no+"");
        }
    }
}
