import java.io.*;
import java.util.Scanner;

// 백준에서는 이 세팅으로 해야 컴파일 잘됨
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        char[] S = sc.nextLine().toCharArray();

        int i = sc.nextInt();

        System.out.println(Character.toString(S[i-1]));
    }
}

