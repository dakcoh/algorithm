import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] words = s.split(" ");

        int[] numbers = Arrays.stream(words)
                .mapToInt(Integer::parseInt)
                .toArray();

        int max = Arrays.stream(numbers).max().getAsInt();
        int min = Arrays.stream(numbers).min().getAsInt();

        answer = min + " " + max;
        return answer;
    }
}