public class CountOccurence {
    public static int findFirst(int[]arr,int key){
        int start=0;
        int end=arr.length-1;
        int result=-1;
        while(start<=end){
            int mid=start+(end-start);

            if(arr[mid]==key){
                result=mid;
                end=mid-1;
            } else if (arr[mid]<key) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return result;
    }
    public static int findLast(int[]arr,int key){
        int start=0;
        int end=arr.length-1;
        int result=-1;
        while(start<=end){
            int mid=start+(end-start);
            if(arr[mid]==key){
                result=mid;
                start=mid+1;
            } else if (arr[mid]<key) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return result;
    }
    public static int countOccurence(int[]arr,int key){
        int first=findFirst(arr, key);
        if(first==-1){
            return 0;
        }
        int last=findLast(arr, key);
        return last-first+1;
    }
    public static void main(String[] args) {
        int[]arr={1,2,2,2,3,4,5,6};
        int key=2;
        int count=countOccurence(arr,key);
        System.out.println("Element "+key+" Occurs "+count+" times");
    }
}
