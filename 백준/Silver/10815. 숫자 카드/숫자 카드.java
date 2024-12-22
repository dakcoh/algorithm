import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());
        HashMap<Integer, Integer> arrn = new HashMap<>();
        for(int i = 0; i < 1; i++) {
            String[] x = bf.readLine().split(" ");
            for(int j = 0; j < n; j++) {
                arrn.put(Integer.parseInt(x[j]), j);
            }
        }

        int m = Integer.parseInt(bf.readLine());
        int[] arr = new int[m];

        for(int i = 0; i < 1; i++) {
                String[] y = bf.readLine().split(" ");
            for(int j = 0; j < m; j++) {
                arr[j] = Integer.parseInt(y[j]);
            }
        }

        for (int i = 0; i < m; i++) {
            int a = 0;
            if(arrn.containsKey(arr[i])) {
                a += 1;
            }else{
                a += 0;
            }
            bw.write(a + " ");
        }

        bw.flush();
        bw.close();
    }
}