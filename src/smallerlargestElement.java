public class smallerlargestElement {
    public static int Findsmalllarger(int[]arr,int key){
        int start=0;
        int end=arr.length-1;
        int result=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>key){
                result=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[]arr={1,3,5,7,9};
        int key=5;
        int index=Findsmalllarger(arr,key);
        if(index!=-1){
            System.out.println("Index "+index+"Value "+arr[index]);
        }else{
            System.out.println("No element is greater than the targeted element");
        }
    }
}
