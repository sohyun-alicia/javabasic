package inputoutput;
import java.io.InputStream;


public class StreamTest {

// 콘솔 입출력 : System.in
    public static void main(String[] args) throws Exception {
        InputStream in = System.in;

        int a;
        a = in.read();

        System.out.println(a);
    }
}
