class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

        String lower = s.toLowerCase();
        boolean isStart = true;

        for (char c : lower.toCharArray()) {
            if (isStart && Character.isLetter(c)) {
                answer.append(Character.toUpperCase(c));
            } else {
                answer.append(c);
            }

            isStart = (c == ' ');
        }

        return answer.toString();
    }
}