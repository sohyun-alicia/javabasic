package objectorientedprogramming;


// class Updater {
//     public void update(int count) {
//         count++;
//     }
// }

// public class Counter {
//     int count = 0;
//     public static void main(String[] args) {
//         Counter myCounter = new Counter();               // 객체 생성
//         System.out.println("before update:"+myCounter.count);
//         Updater myUpdater = new Updater();
//         myUpdater.update(myCounter.count);
//         System.out.println("after update:"+myCounter.count);
//     }
// }

class Updater {
    public void update(Counter counter) {                   // 변수가 아닌 객체 자체를 전달
        counter.count++;
    }
}

public class Counter {
    int count = 0;
    public static void main(String[] args) {
        Counter myCounter = new Counter();                  // 객체 생성
        System.out.println("before update:"+myCounter.count);
        Updater myUpdater = new Updater();
        myUpdater.update(myCounter);                        // 변수가 아닌 객체 자체를 전달
        System.out.println("after update:"+myCounter.count);
    }
}

