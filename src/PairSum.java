import java.util.Scanner;

public class PairSum {

    public static int pairSum(int[]arr,int target){
        int n =arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    sum++;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size:");
        int n=sc.nextInt();
        int[]arr=new int[n];

        System.out.println("Enter the "+n+" elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the target amount:");
        int target=sc.nextInt();

        System.out.println(pairSum(arr,target));
    }
}
