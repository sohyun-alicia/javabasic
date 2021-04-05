// -------------------------- 3. 자료형 --------------------------//
// 3-1. 숫자
// 정수형 : int(default), long
// 실수 : float, double(default)

// 사칙연산
public class FourArithmetic {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 5;
        // System.out.println(a + b);
        // System.out.println(a - b);
        // System.out.println(a * b);
        // System.out.println(a / b);
        // System.out.println();
        // System.out.println(7 % 3);
        // System.out.println(3 % 7);

        // 증감연산자(++, --)
        // int i = 0;
        // int j = 10;
        // i++;
        // j--;

        // System.out.println(i);
        // System.out.println(j);

        int i = 0;
        
        System.out.println(i+1);    // 1 
        System.out.println(i++);    // 1? >>> 0
        System.out.println(i);      // 0

        int j = 0;
        
        System.out.println(j);      // 0
        System.out.println(j++);    // 0

        int a = 0;
        
        System.out.println(++a);    // 1
        System.out.println(a);      // 1
    }
}


