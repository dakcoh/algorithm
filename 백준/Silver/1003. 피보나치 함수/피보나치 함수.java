import java.io.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        int[][] dp = new int[41][2];
        int[][] result = new int[n][2];

        dp[0][0] = 1;
        dp[1][1] = 1;

        int input;
        for (int i=0; i<n; i++) {
            input = Integer.parseInt(reader.readLine());

            if (input <= 1) {
                result[i][0] = dp[input][0];
                result[i][1] = dp[input][1];
            } else {
                for (int j=2; j<=input; j++) {
                    dp[j][0] = dp[j-2][0] + dp[j-1][0];
                    dp[j][1] = dp[j-2][1] + dp[j-1][1];
                }
                result[i][0] = dp[input][0];
                result[i][1] = dp[input][1];
            }
        }

        for (int i=0; i<n; i++) {
            System.out.println(result[i][0] + " " + result[i][1]);
        }
    }
}