package objectorientedprogramming;

public class HouseDog extends Dog {

    // 생성자(Constructor) : 객체 생성할 때 호출됨
    public HouseDog(String name) {
        this.setName(name);
    }
    // 생성자 규칙
    // 1. 클래스명과 메소드명이 동일하다
    // 2. 리턴타입을 정의하지 않는다.

    // 생성자 오버로딩(Constructor overloading) : 입력 항목이 다른 생성자를 여러개 만들 수 있음
    public HouseDog(int type) {
        if (type == 1) {
            this.setName("yorkshire");
        } else if (type == 2) {
            this.setName("bulldog");
        }
    }

    // 메소드 오버라이딩(method overriding)
    public void sleep() {                       // Dog(부모)의 sleep() 메서드를 오버라이딩(덮어쓰기)
        System.out.println(this.name+"...zzz in house");
    }

    // 메소드 오버로딩(method overloading)
    public void sleep(int hour) {               // 입력 항목이 다른 경우 동일한 이름의 메소드 만들 수 있음
        System.out.println(this.name+"...zzz in house for "+hour+" hours.");
    }

    public static void main(String[] args) {
        HouseDog dog = new HouseDog("happy");       // 생성자 호출
        HouseDog yorkshire = new HouseDog(1);
        System.out.println(dog.name);
        System.out.println(yorkshire.name);

    }
    
}
