import java.io.*;
import java.util.Scanner;

// 백준에서는 이 세팅으로 해야 컴파일 잘됨
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a + b - c);
        String A = String.valueOf(a);
        String B = String.valueOf(b);
        int num = Integer.parseInt(A+B);
        System.out.println(num-c);

    }
}

