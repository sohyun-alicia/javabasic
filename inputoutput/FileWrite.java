package inputoutput;
import java.io.FileOutputStream;        // 파일 생성
import java.io.IOException;             // 예외 처리
import java.io.FileWriter;
import java.io.PrintWriter;


public class FileWrite {

    public static void main(String[] args) throws IOException {
        // 파일 생성하기
        // FileOutputStream output = new FileOutputStream("out.txt");  // 생성자로 파일명 넘겨주기
        
        // 파일 내용쓰기 1
        // for (int i=1; i<11; i++) {
        //     String data = i+"번째 줄입니다.\r\n";       // \r\n : 줄바꿈 문자
        //     output.write(data.getBytes());  // getBytes: String을 byte배열로 바꿔줌
        // }

        // output.close();      
        // 사용한 파일 객체 닫아주기. 생략 가능   


        // 파일 내용쓰기 2
        // FileWriter fw = new FileWriter("out.txt");
        // for (int i=1; i<11; i++) {
        //     String data = i+"번째 줄입니다.\r\n";
        //     fw.write(data);
        // }
        // fw.close();

        // FileWriter("c:/out.txt", true) 와 같이 두번째 입력값이 추가로 입력되어 생성
        // boolean 입력 파라미터는 파일을 추가모드(append)로 열것인지에 대한 구분값
        // FileWriter fw2 = new FileWriter("out.txt", true);
        // for (int i=11; i<21; i++) {
        //     String data = i+"번째 줄입니다.\r\n";
        //     fw2.write(data);
        // }
        // fw2.close();

        // 파일 내용쓰기 3
        // PrintWriter pw = new PrintWriter("out.txt");
        // for (int i=1; i<11; i++) {
        //     String data = i+"번째 줄입니다.";
        //     pw.println(data);
        // }
        // pw.close();

        // PrintWriter pw2 = new PrintWriter(new FileWriter("out.txt", true));
        // for (int i=11; i<21; i++) {
        //     String data = i+"번째 줄입니다.";
        //     pw2.println(data);
        // }
        // pw2.close();

        // 1부터 100까지의 숫자 중에서 홀수만 odd.txt로 저장하기

        PrintWriter od = new PrintWriter("odd.txt");
        for (int i=1; i<100; i++) {
            if (i % 2 == 1)
            od.println(i);
        }
        od.close();
        
    }
}
