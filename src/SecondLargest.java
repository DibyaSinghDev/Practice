public class SecondLargest {
    public static int findlargest(int[]arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int findsecondLargest(int[]arr){
        int max=findlargest(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondMax=findlargest(arr);
        return secondMax;
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        System.out.println("SecondLargest Element:"+findsecondLargest(arr));
    }
}
