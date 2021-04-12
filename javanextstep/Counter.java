package javanextstep;

public class Counter {
    static int count = 0;
    Counter() {
        this.count++;
    }

    public static int getCount() {
        return count;
    }
    // static 메소드 안에서는 인스턴스 변수 접근이 불가능.
    // 위에서 count는 static 변수이기 때문에 static method에서 접근이 가능했던 것
    
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        // main 메소드에서 static 메소드(getCount()) 호출 가능
        System.out.println(Counter.getCount());
    }
    
}

