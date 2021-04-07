package objectorientedprogramming;

public class ZooKeeper {

    public void feed(Predator predator) {
        System.out.println("feed "+predator.getFood());
    }


    // public void feed(Tiger tiger) {
    //     System.out.println("feed apple");
    // }

    //  // 메소드 오버로딩(입력값 타입이 다르면 동일한 메서드를 중복 사용 가능)
    // public void feed(Lion lion) {          
    //     System.out.println("feed banana");
    // }

    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Crocodile crocodile = new Crocodile();

        zooKeeper.feed(tiger);
        zooKeeper.feed(lion);
        zooKeeper.feed(crocodile);
    }
    
}
