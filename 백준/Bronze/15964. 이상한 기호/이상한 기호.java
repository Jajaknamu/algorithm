import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

// 백준에서는 이 세팅으로 해야 컴파일 잘됨
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int result = Fun(A, B);

        System.out.println(result);
    }

    public static int Fun(int A, int B) {
        return (A + B) * (A - B);
    }
}

