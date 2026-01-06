import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

// 백준에서는 이 세팅으로 해야 컴파일 잘됨
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int M,N = 0;
        N = sc.nextInt();
        M = sc.nextInt();

        int[][] A = new int[N][M];
        int[][] B = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        int[][] res = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                res[i][j] = A[i][j] + B[i][j];
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}

