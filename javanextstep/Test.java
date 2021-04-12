package javanextstep;

public class Test {
    public void shouldBeRun() {
        System.out.println("ok Thanks");
    }

    public static void main(String[] args) {
        Test test = new Test();
        int c;
        try {
            c = 4 / 0;
            test.shouldBeRun();
        } catch (ArithmeticException e) {
            c = -1;
        } finally {                 
            test.shouldBeRun();
        }
        // finally 구문은 try 문장 수행 중 예외발생 여부와 상관없이 무조건 실행
    }
}
