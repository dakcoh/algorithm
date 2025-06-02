import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        long cnt = Integer.parseInt(br.readLine());
        System.out.println(cnt * cnt);
        System.out.println(2);
    }
}