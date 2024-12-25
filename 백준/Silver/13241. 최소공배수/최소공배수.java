import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = a * b;

        while (b > 0) {
            long temp = a;
            a = b;
            b = temp%b;
        }

        bw.write(String.valueOf(c/a));
        bw.flush();
        bw.close();
        br.close();
    }
}