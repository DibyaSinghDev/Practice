
import java.util.*;

public class ChargingPhone {

    static long getRate(long c) {
        if (c <= 10) return 10;
        else if (c <= 230)
            return 5;
        else if (c <= 559)
            return 8;
        else if (c <= 1009)
            return 2;
        else if (c <= 5000)
            return 7;
        else if (c <= 10000)
            return 8;
        else
            return 3;
    }

    static long getMaxLimit(long c) {
        if (c <= 10) return 10;
        else if (c <= 230)
            return 230;
        else if (c <= 559)
            return 559;
        else if (c <= 1009)
            return 1009;
        else if (c <= 5000)
            return 5000;
        else if (c <= 10000)
            return 10000;
        else
            return (long)1e9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Q = sc.nextInt();

        while (Q-- > 0) {
            long S = sc.nextLong();
            long T = sc.nextLong();

            long time = 0;

            while (S < T) {
                long rate = getRate(S);
                long maxLimit = getMaxLimit(S);

                long target = Math.min(T, maxLimit + 1);

                long need = target - S;

                long minutes = (need + rate - 1) / rate; // ceil

                time += minutes;
                S += minutes * rate;
            }

            System.out.println(time);
        }
    }
}
