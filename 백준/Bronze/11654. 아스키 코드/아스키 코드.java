import java.io.*;
import java.util.Scanner;

// 백준에서는 이 세팅으로 해야 컴파일 잘됨
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        int num = (int)ch;
        
        System.out.println(num);
    }
}

