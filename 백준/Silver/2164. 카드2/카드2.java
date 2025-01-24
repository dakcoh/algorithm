import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        Deque<String> stack = new ArrayDeque<>();

        for(int i = N; i >= 1; i--) {
            stack.push(String.valueOf(i));
        }

        for(int i = stack.size()-1; i >= 1; i--) {
            stack.removeFirst();
            stack.addLast(stack.pollFirst());
        }
        System.out.println(stack.getFirst());
        br.close();
    }
}