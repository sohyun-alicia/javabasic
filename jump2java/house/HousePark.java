package jump2java.house;
// 동일한 패키지 내에 있는 클래스면 import 를 따로 할 필요 없음

public class HousePark {
    // 접근제어자 protected :
    // 동일 패키지내의 클래스 또는 해당 클래스를 상속받은 외부 패키지의 클래스에서 접근이 가능
    // protected String lastname = "park";

    // HouseKim의 lastname 변수는 접근제어자가 default이므로
    // kim.lastname 으로 HouseKim의 lastname 변수에 접근이 가능
    // public static void main(String[] args) {
    //     HouseKim kim = new HouseKim();
    //     System.out.println(kim.lastname);
    // }

    // public String info = "this is public message.";

    static String lastname = "박";
    // static을 사용하면 메모리 할당을 딱 한번만 함
    // 변수 공유

    public static void main(String[] args) {
        HousePark pey = new Housepark();
        HousePark pes = new HousePark();
    }
}


