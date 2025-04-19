public class Eagle extends Bird {
    public Eagle(String name, String color, int weight) {
        super(name, color, weight);
    }

    @Override
    public void fly() {
        System.out.println("Eagle is soaring high.");
    }

    @Override
    public void saySomething() {
        System.out.println("Eagle screams!");
    }

    @Override
    public void eat() {
        System.out.println("Eagle eats meat.");
    }
}
