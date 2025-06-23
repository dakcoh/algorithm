import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        Boolean isPos = true;
        int start = 1;
        while(n-- > 0) {
            int num = Integer.parseInt(br.readLine());
            while (start <= num) {
                stack.push(start++);
                sb.append("+\n");
            }
            if(stack.peek() == num) {
                stack.pop();
                sb.append("-\n");
            } else {
                isPos = false;
                break;
            }
        }
        System.out.println(isPos ? sb : "NO");
    }
}