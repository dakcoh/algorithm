import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        int[] arr = Arrays.stream(br.readLine().split(" "))
                          .mapToInt(Integer::parseInt)
                          .toArray();

        int rows = (arr[0] + arr[2]) / (arr[2] + 1);
        int cols = (arr[1] + arr[3]) / (arr[3] + 1);

        System.out.println(rows * cols);
    }
}