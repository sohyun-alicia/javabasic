package objectorientedprogramming;

public class Dog extends Animal {       // 자식클래스 extends 부모클래스


    public Dog() {                      // default 생성자

    }


    public void sleep() {
        System.out.println(this.name + "...zzz");
    }

    // IS-A 관계 "Dog is a(n) Animal"
    // public static void main(String[] args){
    //     Dog dog = new Dog();
    //     Dog puppy = new Dog();
    //     dog.setName("poppy");
    //     puppy.setName("happy");

    //     System.out.println(dog.name);
    //     System.out.println(puppy.name);
    //     dog.sleep();
    //     puppy.sleep();
    // }
    
}
