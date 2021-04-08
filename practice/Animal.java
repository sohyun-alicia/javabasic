package practice;

public class Animal {
    String name;

    public void setName(String name){           // 입력 : String name
        this.name = name;                       // 출력 : void(리턴값 없음)
                                                // this는 Animal 클래스에 의해서 생성된 객체를 지칭
    }

    // public static void main(String[] args) {
    //     Animal cat = new Animal();
    //     cat.setName("bobby");                   // 메소드 호출
    //                                             // 객체가 메소드를 호출하기 위해서는 객체.메소드 로 호출
    //     System.out.println(cat.name);           // 객체 변수에 값을 대입하는 방법 : 객체.객체변수 = 값

    // }
}