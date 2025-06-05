import java.io.*;

public class Main {
    static int[] nums = {1, 2, 3};
    static int[] dp = new int[10001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int[] testCases = new int[T];
        int max = 0;

        for (int i = 0; i < T; i++) {
            testCases[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, testCases[i]);
        }

        dp[0] = 1;

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums[i]; j <= max; j++) {
                dp[j] += dp[j - nums[i]];
            }
        }

        for (int i = 0; i < T; i++) {
            System.out.println(dp[testCases[i]]);
        }
    }
}