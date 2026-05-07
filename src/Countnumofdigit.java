public class Countnumofdigit {
    static int print(int n){
        if(n == 0){
            return 0;
        }

        return 1+print(n/10);
    }
    public static void main(String[]args){

        System.out.println(print(2435678));
    }
}
