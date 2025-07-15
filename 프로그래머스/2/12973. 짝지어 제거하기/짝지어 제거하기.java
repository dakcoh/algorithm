class Solution
{
    public int solution(String s)
    {
        int answer = -1;

        StringBuilder stack = new StringBuilder();
        for (char c : s.toCharArray()) {
            int len = stack.length();
            if (len > 0 && stack.charAt(len - 1) == c) {
                stack.deleteCharAt(len - 1);
            } else {
                stack.append(c);
            }
        }
        answer = stack.length() == 0 ? 1 : 0;

        return answer;
    }
}