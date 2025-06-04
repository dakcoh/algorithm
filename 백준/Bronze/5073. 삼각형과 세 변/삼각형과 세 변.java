import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            long[] num = Arrays.stream(br.readLine().split(" "))
                    .mapToLong(Long::parseLong)
                    .toArray();

            if (num[0] == 0 && num[1] == 0 && num[2] == 0) break;

            long a = num[0], b = num[1], c = num[2];

            if (a < b + c && b < a + c && c < a + b) {
                if(a == b && b == c && a == c) {
                    System.out.println("Equilateral");
                } else if(a == b || b == c || a == c) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            } else {
                System.out.println("Invalid");
            }
        }
    }
}