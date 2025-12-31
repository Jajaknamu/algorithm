import java.io.*;

// 백준에서는 이 세팅으로 해야 컴파일 잘됨
public class Main {
    public static void main(String[] args) throws IOException {

        //입력 도와주는 애
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //출력 도와주는 애
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String string = br.readLine();
        int T = Integer.parseInt(string);

        for (int i=0; i<T; i++) {
            String[] s = br.readLine().split(" ");
            int A = Integer.parseInt(s[0]);
            int B = Integer.parseInt(s[1]);

            bw.write((A+B) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
