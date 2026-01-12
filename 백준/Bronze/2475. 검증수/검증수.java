import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

// 백준에서는 이 세팅으로 해야 컴파일 잘됨
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();
        
        int answer = Fun(A, B, C, D, E);

        System.out.println(answer);
    }

    public static int Fun(int A, int B,int C, int D, int E) {
        int a = A*A;
        int b = B*B;
        int c = C*C;
        int d = D*D;
        int e = E*E;

        int result = (a+b+c+d+e)%10;
        return result;
    }
}

