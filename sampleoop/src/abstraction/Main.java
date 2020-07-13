package abstraction;

public class Main{

    public static void main(String[] args) {

        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();

        System.out.println("Weight " + myPig.getWeight());

    }
}