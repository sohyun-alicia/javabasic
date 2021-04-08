package practice;


public class HouseDog extends Dog {

    // 생성자(Constructor)
    // name 이라는 객체 변수에 값을 무조건 설정해야만 객체가 생성될 수 있도록 강제
    // 생성자는 객체가 생성될 때 호출
    public HouseDog(String name) {
        this.setName(name);
    }

    // 생성자 오버로딩(Constructor Overloading)
    public HouseDog(int type) {
        if (type == 1) {
            this.setName("yorkshire");
        }else if (type == 2) {
            this.setName("bulldog");
        }
    }


    // 메소드 오버라이딩(Method Overriding) : 부모 메소드를 라이딩
    public void sleep() {                           
        System.out.println(this.name + "...zzz in house.");
    }

    // 메소드 오버로딩(Method Overloading) : 입력항목이 다른 경우 동일한 이름의 메소드 생성 가능
    public void sleep(int hour) {
        System.out.println(this.name+"...zzz in house for " + hour + " hours.");
    } 

    public static void main(String[] args) {
        // HouseDog dog = new HouseDog("happy");
        HouseDog dog = new HouseDog(1);
        System.out.println(dog.name);
        // HouseDog houseDog = new HouseDog();
        // houseDog.setName("happy");
        // houseDog.sleep();
        // houseDog.sleep(3);
    }
}
