public class InsertionPosition {
    public static int findinsertion(int[]arr,int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[]arr={1,3,7,9};
        int key=5;
        System.out.println("Insertion Position:"+findinsertion(arr,key));
    }
}
