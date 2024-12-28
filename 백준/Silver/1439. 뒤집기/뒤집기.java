import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();
        int chan = 0;

        for (int i = 1; i < num.length(); i++) {
            if (num.charAt(i - 1) != num.charAt(i)) ++chan;
        }

        System.out.println((int) Math.ceil((double) chan / 2));
    }
}