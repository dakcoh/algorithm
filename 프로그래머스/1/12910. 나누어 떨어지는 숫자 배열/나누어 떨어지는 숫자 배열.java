import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        for (int n : arr) {
            if (n % divisor == 0) {
                list.add(n);
            }
        }

        if (list.isEmpty()) return new int[]{-1};

        return list.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}