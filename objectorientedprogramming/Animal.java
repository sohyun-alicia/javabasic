package objectorientedprogramming;


public class Animal {
    String name;                            // name이라는 String변수 추가
                                            // 클래스에 선언된 변수 = "객체변수"
    // 클래스에 의해 생성되는 것은 '객체', 그리고 그 클래스에 선언된 변수는 '객체 변수'

    public void setName(String name){
        this.name = name;
    }





    // 객체(instance) 만들기 cat, dog
    // public static void main(String[] args){
    //     Animal cat = new Animal();
    //     cat.setName("bobby");               // 메소드 호출

    //     Animal dog = new Animal();
    //     dog.setName("happy");

    //     Animal horse = new Animal();
    //     horse.setName("nabi");

    //     Animal rabbit = new Animal();
    //     rabbit.setName("mija");

    //     System.out.println(cat.name);    
    //     System.out.println(dog.name);  
    //     System.out.println(horse.name);
    //     System.out.println(rabbit.name);
    //     // 객체 변수는 공유되지 않는다. (매우중요)
    //     // 객체 변수의 값은 독립적으로 유지됨
    // }

    // public void setName(String name) {
    //     this.name = name;                   // this = 파이썬의 self라고 생각하면 됨. 객체를 지칭.
    // }
}
