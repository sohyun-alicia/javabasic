package inputoutput;
import java.util.Scanner;


public class Test {
    // public static void main(String[] argv) throws Exception {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println(sc.next());
    // }

    // 입력을 받아서 1이면 '1번 선택하셨습니다.', 2이면 '2번 선택하셨습니다.' 3이면 '3번 선택하셨습니다.' 출력

    // public static void main(String[] argv) throws Exception {
    //     Scanner sc = new Scanner(System.in);
    //     int b = sc.nextInt(b);


    //     System.out.println(sc.next());
    // }

    public static void main(String[] argv) throws Exception {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        if (b < 4)
        System.out.println(b + "번 선택하셨습니다.");
    }
}

