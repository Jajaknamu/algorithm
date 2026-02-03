import java.io.*;
import java.util.Scanner;

// 백준에서는 이 세팅으로 해야 컴파일 잘됨
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s= sc.next();

        int[] nums = new int[N];

        int sum = 0;

        for (int i = 0; i < N; i++) {
            nums[i] = s.charAt(i) - '0';
            sum += nums[i];
        }

        System.out.println(sum);
    }
}

