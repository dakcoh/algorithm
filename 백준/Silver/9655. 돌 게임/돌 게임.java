import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String win = "CY";

        while (N > 0) {
            if (N >= 3) {
                N = N - 3;
            } else {
                N = N - 1;
            }
            win = win.equals("SK") ? "CY" : "SK";
        }
        System.out.println(win);
    }
}