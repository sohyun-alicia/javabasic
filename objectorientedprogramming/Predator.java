package objectorientedprogramming;

// 추상클래스 : abstract method 뿐만 아니라 실제 메소드도 추가 가능
public abstract class Predator extends Animal {
    public abstract String getFood();            
    // 이름과 입출력 정의만 있고 내용은 없음
    // 인터페이스는 규칙이기 때문
    // getFood() 메소드는 인터페이스를 implements한 클래스들이 구현해야됨

    public boolean isPredator() {
        return true;
    }
}
