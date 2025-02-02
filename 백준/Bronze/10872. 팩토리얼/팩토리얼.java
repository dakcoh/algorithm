import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long sum = 1;

        for(int i=1; i<=a; i++) {
            sum *= i;
        }
        System.out.println(sum);
    }
}