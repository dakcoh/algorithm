import java.io.*;
import java.math.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        BigInteger cnt = new BigInteger("2");
        System.out.println(cnt.pow(n).subtract(new BigInteger("1")));

        if (n <= 20)
            hanoi(n, 1, 2, 3);
    }

    public static void hanoi(int n, int start, int sub, int end){
        if(n==1){
            System.out.println(start +" "+ end);
            return;
        }
        hanoi(n-1, start, end, sub);
        System.out.println(start+" "+end);
        hanoi(n-1, sub, start, end);
    }
}