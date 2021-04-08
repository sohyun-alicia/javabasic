package objectorientedprogramming;

public class Tiger extends Predator implements Barkable {
    public String getFood() {
        return "apple";
    }

    public void bark() {
        System.out.println("어흥");
    }

    public static void main(String[] args){
       Tiger tiger = new Tiger(); 
       System.out.println(tiger.isPredator());
    }
    

    
}
