import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

// 백준에서는 이 세팅으로 해야 컴파일 잘됨
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> arrayList = new ArrayList<>();

        while (sc.hasNextLine()) {
            String S = sc.nextLine();
            arrayList.add(S);
            if (S.isEmpty()) break;
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}

