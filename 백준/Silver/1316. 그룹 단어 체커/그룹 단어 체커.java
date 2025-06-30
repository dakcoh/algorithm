import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        while (n-- > 0) {
            String word = br.readLine();
            boolean[] seen = new boolean[26];
            boolean isGroup = true;

            for(int i=0; i<word.length(); i++) {
                char c = word.charAt(i);
                if(i>0 && c != word.charAt(i-1) && seen[c - 'a']) {
                    isGroup = false;
                    break;
                }
                seen[c - 'a'] = true;
            }
            if(isGroup) count++;
        }
        System.out.println(count);
    }
}