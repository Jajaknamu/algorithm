import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

// 백준에서는 이 세팅으로 해야 컴파일 잘됨
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[28];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        boolean[] booleans = new boolean[31];

        for (int i = 1; i <= 30; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    booleans[i] = true;
                }
            }
        }
        //System.out.println(Arrays.toString(booleans));

        for (int i = 1; i < booleans.length; i++) {
            if (booleans[i] == false) {
                System.out.println(i);
            }
        }
    }
}

