import java.io.*;
import java.util.Scanner;

// 백준에서는 이 세팅으로 해야 컴파일 잘됨
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        char[] str = sc.nextLine().toCharArray();

        for (int i=0;i<str.length;i++){
            if (str[i] == Character.toLowerCase(str[i])) {
                str[i] = Character.toUpperCase(str[i]);
            } else if (str[i] == Character.toUpperCase(str[i])) {
                str[i] = Character.toLowerCase(str[i]);
            }
        }

        System.out.println(str);

    }
}

