import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

// 백준에서는 이 세팅으로 해야 컴파일 잘됨
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int num =  sc.nextInt();
        sc.nextLine(); //\n값 더 추가로생기는거 방지용

        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String S = sc.nextLine();
            arrayList.add(S);
        }

        for (int i = 0; i < num; i++) {
            System.out.print(arrayList.get(i).charAt(0));
            System.out.println(arrayList.get(i).charAt(arrayList.get(i).length()-1));
        }
    }
}

