public class FibonacciRecursion {
    static int print(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return print(n-1)+print(n-2);
    }
    public static void main(String[]args){
        int  n=15;
        for(int i=0;i<n;i++){
            System.out.print(print(i)+",");
        }
    }
}
