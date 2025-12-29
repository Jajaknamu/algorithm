import java.util.Scanner;

// 백준에서는 이 세팅으로 해야 컴파일 잘됨
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("1");
        } else if ((year % 100 == 0 && year % 400 == 0) || year % 400 != 0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }
}