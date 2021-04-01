// 3-4. 문자열 String

// int, long, double, float, boolean, char 등을 자바는 primitive 자료형 이라고 부른다. 
// 이런 primitive 자료형은 new 키워드로 생성할 수 없다.

// primitive 자료형은 다음과 같이 리터럴(literal)로 값을 세팅할 수 있다. 
// (※ 리터럴은 계산식 없이 소스코드에 표기하는 상수 값을 의미한다.)

public class StringExample {
    public static void main(String[] args) {
        String a = "hello";
        String b = "java";
        String c = "hello";
        String d = new String("hello");

        System.out.println(a.equals(b));    // false
        System.out.println(a.equals(c));    // true

        // 문자열의 값을 비교할때는 반드시 equals 를 사용해야 한다. 
        // '==' 연산자를 사용할 경우 다음과 같은 경우가 발생할 수 있다.

        System.out.println(a == c);         // true
        System.out.println(a == d);         // false
        System.out.println(a.equals(d));    // true

        //a와 d는 값은 같지만 서로 다른 객체이다. 
        // == 은 두개의 자료형이 동일한 객체인지를 판별할 때 사용하는 연산자이기 때문에 false를 리턴
    
        System.out.println(System.identityHashCode(a));     // id : 942731712
        System.out.println(System.identityHashCode(c));     // id : 942731712
        System.out.println(System.identityHashCode(d));     // id : 971848845
    }
}


