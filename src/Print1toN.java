public class Print1toN {
    static int print(int n) {
        if (n == 0)
            return 0;
        print(n - 1);
        System.out.print(n + " ");
        return n;
    }

    public static void main(String[] args) {
        print(5);
    }
}

