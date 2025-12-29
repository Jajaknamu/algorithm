import java.util.Scanner;

// 백준에서는 이 세팅으로 해야 컴파일 잘됨
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long N = sc.nextLong();
        Long M = sc.nextLong();

        System.out.println(Math.abs(N-M));

    }
}