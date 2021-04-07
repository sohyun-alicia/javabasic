public class Test {
    // 1. 입력값, 리턴값 둘 다 있는 메소드
    // public int sum(int a, int b) {
    //     return a + b;
    // }

    // public static void main(String[] args) {
    //     int a = 3;
    //     int b = 4;

    //     Test myTest = new Test();
    //     int c = myTest.sum(a, b);           // 위의 sum의 return 값이 int이기 때문에 c도 int로 설정

    //     System.out.println(c);
    // }

    // 2. 입력값이 없는 메소드
    // public String say() {
    //     return "Hi";
    // }

    // public static void main(String[] args) {
    //     Test myTest = new Test();
    //     String a = myTest.say();
    //     System.out.println(a);
    // }

    // 3. 리턴값이 없는 메소드
    // public void sum(int a, int b) {
    //     System.out.println(a+"과"+b+"의 합은"+(a+b)+"입니다.");
    // }

    // public static void main(String[] args) {
    //     Test myTest = new Test();
    //     myTest.sum(3, 4);
    // }

    // 4. 입력값도 리턴값도 없는 메소드
    // public void say(){
    //     System.out.println("Hi");
    // }

    // public static void main(String[] args) {
    //     Test myTest = new Test();
    //     myTest.say();
    // }

    // public void say_nick(String nick) {
    //     if ("fool".equals(nick)) {
    //         return;                         //'fool'이라는 값이 들어오면 문자열을 출력하지 않고 메소드를 즉시 빠져나감 
    //     }
    //     System.out.println("나의 별명은 "+nick+" 입니다.");
    // }

    // public static void main(String[] args) {
    //     Test sohyun = new Test();
    //     Test alicia = new Test();
    //     Test timothy = new Test();


    //     sohyun.say_nick("babo"); 
    //     alicia.say_nick("fool");
    //     timothy.say_nick("Elio");
    // }

        // 메소드 내에서 선언된 변수의 효력 범위 1
        // public int vartest(int a) {
        //     a = a * 100;
        //     return a;
        // }

        // public static void main(String[] args) {
        //     int a = 1;
        //     Test myTest = new Test();
        //     myTest.vartest(a);
        //     System.out.println(a);

        // }


        // 메소드 내에서 선언된 변수의 효력 범위 2
        // public int vartest(int a) {
        //     ++a;
        //     return a;
        // }

        // public static void main(String[] args) {
        //     int a = 1;
        //     Test myTest = new Test();
        //     myTest.vartest(a);
        //     System.out.println(a);

        // }

        // public int vartest(int a) {
        //     ++a;
        //     return a;
        // }

        // public static void main(String[] args) {
        //     int a = 1;
        //     int c;
        //     Test myTest = new Test();
        //     c = myTest.vartest(a);
        //     System.out.println(c);

        // }


        int a;  // 객체변수 a

        public void vartest(Test test) {
            test.a++;
        }
    
        public static void main(String[] args) {
            Test myTest = new Test();
            myTest.a = 1;
            myTest.vartest(myTest);
            System.out.println(myTest.a);
        }
        // int 자료형과 같은 primitive 자료형인 경우 값이 전달
        // 그 이외의 경우(reference 자료형)는 객체가 전달
        // primitive 자료형 : int, long, double, float, boolean, char 등

}

