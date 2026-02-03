import java.io.*;
import java.util.Scanner;

// 백준에서는 이 세팅으로 해야 컴파일 잘됨
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}

