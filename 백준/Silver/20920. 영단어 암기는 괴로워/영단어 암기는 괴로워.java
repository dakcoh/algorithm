import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int N = Integer.parseInt(nm[0]);
        int M = Integer.parseInt(nm[1]);

        Map<String, Integer> map = new HashMap<>();

        while (N-- > 0) {
            String word = br.readLine();
            if (word.length() >= M)
                map.put(word, map.getOrDefault(word, 0) + 1);
        }

        List<String> list = new ArrayList<>(map.keySet());

        list.sort((a, b) -> {
            int freqA = map.get(a), freqB = map.get(b);
            if (freqA != freqB) return freqB - freqA;
            if (a.length() != b.length()) return b.length() - a.length();
            return a.compareTo(b);
        });

        StringBuilder sb = new StringBuilder();
        for (String word : list) {
            sb.append(word).append('\n');
        }
        System.out.print(sb);
    }
}