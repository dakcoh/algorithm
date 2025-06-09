import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int rows = Integer.parseInt(br.readLine());

        double[] num = Arrays.stream(br.readLine().split(" "))
                .mapToDouble(Integer::parseInt)
                .toArray();

        double max = Arrays.stream(num).max().getAsDouble();
        double sum = 0;

        for(int i = 0; i < rows; i++) {
            double percentage = num[i] / max * 100;
            sum += percentage;
        }
        System.out.println(sum/rows);
    }
}