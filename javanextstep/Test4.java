package javanextstep;
import java.util.ArrayList;

public class Test4 implements Runnable {
    int seq;
    public Test4(int seq) {         // 생성자
        this.seq = seq; 
    }

    public void run() {
        System.out.println(this.seq + " thread run.");
        try {
            Thread.sleep(1000);
        }catch(Exception e) {

        }
        System.out.println(this.seq + " thread end.");
    }

    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<Thread>();
        for (int i=0; i<10; i++) {
            Thread t = new Thread(new Test4(i));
            // Thread의 생성자로 Runnable 인터페이스를 구현한 객체를 넘김
            // 인터페이스를 이용해 상속 및 기타 등등에서 좀 더 유연
            t.start();
            threads.add(t);
        }

        for (int i=0; i<threads.size(); i++) {
            Thread t = threads.get(i);
            try {
                t.join();               //  쓰레드가 종료될 때까지 기다리게 하는 메서드
            }catch(Exception e) {

            }
        }
        System.out.println("main end");
       
    }
}
