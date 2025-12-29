import java.util.Scanner;

// 백준에서는 이 세팅으로 해야 컴파일 잘됨
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double N = sc.nextDouble();

        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
    }
}