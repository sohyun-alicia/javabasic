package javanextstep;
import java.util.ArrayList;

public class Test3 extends Thread {
    

    int seq;
    public Test3(int seq) {         // 생성자
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
            Thread t = new Test3(i);
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
        System.out.println(threads);
        // Test3 test = new Test3();
        // test.start();
        // // Thread 클래스는 start 실행 시 run 메소드가 수행되도록 코딩되어 있음.
    }
}
