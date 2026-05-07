public class largersmallerelement {
    public static int findlargesmaller(int[]arr,int key){
        int start=0;
        int end=arr.length-1;
        int result=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<key){
                result=mid;
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[]arr={1,3,5,7,9};
        int key=7;
        int index=findlargesmaller(arr,key);
        if(index!=-1){
            System.out.println("Index "+index+" Value "+arr[index]);
        }else{
            System.out.println("No element smaller than the targeted element");
        }
    }
}
