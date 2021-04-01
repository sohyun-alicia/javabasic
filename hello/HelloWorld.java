// public class HelloWorld {
//     public static void main(String args[]) {   
//         System.out.println("Hello World");
//     }
// }

// public : 메소드 접근제어자. 누구나 이 메소드에 접근할 수 있다는 의미
// static : 인스턴스 생성없이 실행할 수 있음을 의미
// void : 리턴값이 없음
// String : 문자열을 나타내는 자료형
// args[] : String 자료형에 대한 변수명으로 []가 있으므로 여러개 값으로 이뤄진 배열임을 의미
// System.out.println : 표준 출력으로 데이터를 보내는 자바의 내장 메소드로 println 메소드로 들어오는 문자열 값을 화면에 출력

// ------------------------------------2. 자바 시작하기 ------------------------------------//
// 2-1. 변수
// 변수명은 숫자로 시작할 수 없다.
// _(underscore) 와 $ 문자 이외의 특수문자는 사용할 수 없다.
// 자바의 키워드는 변수명으로 사용할 수 없다. (예: int, class, return 등)
// 변수명 앞의 int, String 등은 변수의 자료형(Type)을 뜻한다.

// int a;
// // int 자료형 변수 a에 1 이라는 값을 대입한다.
// String b;
// // String 자료형 변수 b에 "hello java" 라는 값을 대입한다.

// a = 1;
// b = "hello java";

public class HelloWorld {
    public static void main(String args[]) { 
        int a = 1;
        String b = "hello java";

        System.out.println(a);
        System.out.println(b);
    }
}

