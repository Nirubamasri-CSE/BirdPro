public class Dolphin extends Bird {
    public Dolphin(String name, String color, int weight) {
        super(name, color, weight);
    }

    @Override
    public void fly() {
        System.out.println("Dolphin can't fly.");
    }

    @Override
    public void saySomething() {
        System.out.println("Dolphin clicks and whistles.");
    }

    @Override
    public void eat() {
        System.out.println("Dolphin eats fish.");
    }
}
