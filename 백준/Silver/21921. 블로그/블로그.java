import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] input = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int n = input[0];
        int x = input[1];

        int[] num = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        for (int i = 0; i < x; i++) {
            sum += num[i];
        }

        int max = sum;
        int count = 1;

        for (int i = x; i < n; i++) {
            sum = sum - num[i - x] + num[i];

            if (sum > max) {
                max = sum;
                count = 1;
            } else if (sum == max) {
                count++;
            }
        }

        if (max == 0) {
            System.out.println("SAD");
        } else {
            System.out.println(max);
            System.out.println(count);
        }
    }
}