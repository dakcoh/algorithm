import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int[] input = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int lineNumber = input[0];
            int[] height = Arrays.copyOfRange(input, 1, input.length);

            int swapCount = 0;
            for (int i = 0; i < height.length - 1; i++) {
                for (int j = 0; j < height.length - 1 - i; j++) {
                    if (height[j] > height[j + 1]) {
                        int temp = height[j];
                        height[j] = height[j + 1];
                        height[j + 1] = temp;
                        swapCount++;
                    }
                }
            }
            System.out.println(lineNumber + " " + swapCount);
        }
    }
}