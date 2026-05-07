public class LinearSearch {
    public static void main(String[] args) {
        int[]arr={100,101,102,103,104};
        int key=110;
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("Element found at " + i + " index position");
                found=true;
                break;
            }
        }if(!found){
            System.out.println("Element not found");
        }
    }
}
