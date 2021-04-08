package inputoutput;

import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) throws IOException {
        // byte[] b = new byte[1024];
        // FileInputStream input = new FileInputStream("out.txt");
        // input.read(b);
        // System.out.println(new String(b));
        // input.close();
    
        BufferedReader br = new BufferedReader(new FileReader("out.txt"));
        while(true) {
            String line = br.readLine();
            if (line==null) break;
            System.out.println(line);
        }
        br.close();
    }
}
