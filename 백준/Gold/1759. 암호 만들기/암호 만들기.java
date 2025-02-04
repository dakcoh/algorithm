import java.io.*;
import java.util.*;

public class Main {
    public static int L, C;
    public static char[] letters;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        
        letters = new char[C];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < C; i++) {
            letters[i] = st.nextToken().charAt(0);
        }
        
        Arrays.sort(letters);
        
        backtrack(0, 0, 0, 0, new StringBuilder(), bw);
        
        bw.flush();
        bw.close();
        br.close();
    }
    
    public static void backtrack(int start, int length, int vowels, int consonants, StringBuilder sb, BufferedWriter bw) throws IOException {
        if (length == L) {
            if (vowels >= 1 && consonants >= 2) {
                bw.write(sb.toString());
                bw.newLine();
            }
            return;
        }
        
        for (int i = start; i < C; i++) {
            char ch = letters[i];
            sb.append(ch);
            if (isVowel(ch)) {
                backtrack(i + 1, length + 1, vowels + 1, consonants, sb, bw);
            } else {
                backtrack(i + 1, length + 1, vowels, consonants + 1, sb, bw);
            }
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    
    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
