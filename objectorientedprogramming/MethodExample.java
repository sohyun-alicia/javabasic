package objectorientedprogramming;

public class MethodExample {
    // public int sum(int a, int b) {
    //     return a + b;
    // }
    
    // public static void main(String[] args) {
    //     int a = 3;
    //     int b = 4;

    //     MethodExample myTest = new MethodExample();
    //     int c = myTest.sum(a, b);

    //     System.out.println(c);
    // }


    // 1. 전형적인 메소드 (입력값 있음, 리턴값 있음)
    // public int sum(int a, int b) {
    //     return a + b;
    // }

    // public static void main(String[] args) {
    //     int a = 3;
    //     int b = 4;
            
    //     MethodExample myTest = new MethodExample();
    //     int c = myTest.sum(a, b);

    //     System.out.println(c);
    
    // }

    // 2. 입력값 없음, 리턴값 있음
    // public String say() {
    //     return "Hi";
    // }
    // public static void main(String[] args) {            
    //     MethodExample myTest = new MethodExample();
    //     String a = myTest.say();
    //     System.out.println(a);
    // }

    // 3. 입력값 있음, 리턴값 없음
    // public void sum(int a, int b) {
    //     System.out.println(a+"과 "+b+"의 합은 "+(a+b)+"입니다.");
    // }

    // public static void main(String[] args) {            
    //     MethodExample myTest = new MethodExample();
    //     myTest.sum(3, 4);

    // }

    // 4. 입력값 없음, 리턴값 없음
    public void say() {
        System.out.println("Hi");
    }
    public static void main(String[] args) {            
        MethodExample myTest = new MethodExample();
        myTest.say();
    }
}
