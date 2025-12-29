import java.util.Scanner;

// 백준에서는 이 세팅으로 해야 컴파일 잘됨
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = -1;
        int B = -1;
        while (A !=0 && B !=0){
            A = sc.nextInt();
            B = sc.nextInt();

            if (A ==0 && B ==0){
                break;
            }
            System.out.println(A+B);
        }
    }
}