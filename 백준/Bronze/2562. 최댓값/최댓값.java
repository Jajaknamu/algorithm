import java.io.*;
import java.util.Scanner;

// 백준에서는 이 세팅으로 해야 컴파일 잘됨
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];

        int temp = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
        }

        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (temp < arr[i]) {
                temp = arr[i];
                num = i+1;
            }
        }
        System.out.println(temp);
        System.out.println(num);
    }
}

