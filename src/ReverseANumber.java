public class ReverseANumber {
    static int rev = 0;
    static int reverse(int n){
        if(n == 0){
            return 0;
        }
        rev=rev*10+n%10;
        return reverse(n/10);
    }
    public static void main(String[]args){
        reverse(123456789);
        System.out.println(rev);
    }
}
