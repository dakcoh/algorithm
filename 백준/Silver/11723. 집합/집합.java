import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();

        while (count-- > 0) {
            String[] parts = br.readLine().split(" ");
            String cmd = parts[0];

            if (cmd.equals("add")) {
                int x = Integer.parseInt(parts[1]);
                set.add(x);
            } else if (cmd.equals("remove")) {
                int x = Integer.parseInt(parts[1]);
                set.remove(x);
            } else if (cmd.equals("check")) {
                int x = Integer.parseInt(parts[1]);
                bw.write(set.contains(x) ? "1\n" : "0\n");
            } else if (cmd.equals("toggle")) {
                int x = Integer.parseInt(parts[1]);
                if (set.contains(x)) {
                    set.remove(x);
                } else {
                    set.add(x);
                }
            } else if (cmd.equals("all")) {
                set.clear();
                for (int i = 1; i <= 20; i++) {
                    set.add(i);
                }
            } else if (cmd.equals("empty")) {
                set.clear();
            }
        }

        bw.flush();
        bw.close();
    }
}