import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int num = 0;
        
        if (a == b && b == c) {
            num = 10000 + a * 1000;
        } else if (a == b || a == c) {
            num = 1000 + a * 100;
        } else if (b == c) {
            num = 1000 + b * 100;
        } else {
            int max = Math.max(a, Math.max(b, c));
            num = max * 100;
        }
        
        System.out.println(num);
    }
}