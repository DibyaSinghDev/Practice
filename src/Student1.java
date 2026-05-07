import java.util.Scanner;

public class Student1 {
    int USN;
    String Name;
    int m1, m2, m3;
    public void Display1()

    {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the USN :");
            USN = sc.nextInt();

            System.out.println("Enter name of Student:");
            Name = sc.next();

            System.out.println("Enter the mark of JAVA:");
            m1 = sc.nextInt();

            System.out.println("Enter mark of CN:");
            m2 = sc.nextInt();

            System.out.println("Enter the mark of DBMS:");
            m3 = sc.nextInt();

            if (m1 < 40 || m2 < 40 || m3 < 40) throw new Myexception();

            float Avg = (m1 + m2 + m3) / 3;
            System.out.println("Average is:" + Avg);
        } catch (Myexception e) {
            System.out.println(e);
        }

    }
}

