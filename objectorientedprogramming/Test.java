package objectorientedprogramming;

// public class Test {
    // public void vartest(int a) {
    //     a++;
    // }

    // public static void main(String[] args) {
    //     int b = 1;
    //     Test myTest = new Test();
    //     myTest.vartest(b);
    //     System.out.println(b);              // 1 반환(위의 vartest 메소드 영향 X)
    // }



// public class Test {
//     public int vartest(int a) {
//         a++;
//         return a;                           // 입력값을 1만큼 증가시켜서 반환
//     }

//     public static void main(String[] args) {
//         int b = 1;
//         Test myTest = new Test();
//         int c = myTest.vartest(b);
//         System.out.println(c);              // b + 1값 반환
//     }


// 객체 넘기는 방법
    public class Test {
        int a;          // 객체변수 a
        public void vartest(Test test) {
            test.a++;                          // 입력값을 1만큼 증가시켜서 반환
        }
    
        public static void main(String[] args) {
            Test myTest = new Test();
            myTest.a = 1;
            myTest.vartest(myTest);
            System.out.println(myTest.a);              
        }
}

