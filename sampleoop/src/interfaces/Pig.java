package interfaces;

class Pig implements Animal{

    @Override public void animalSound(){
        System.out.println("Oink Oin");
    }

    @Override public void sleep(){
        System.out.println("ZZZ");
    }
}