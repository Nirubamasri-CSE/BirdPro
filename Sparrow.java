public class Sparrow extends Bird {
    public Sparrow(String name, String color, int weight) {
        super(name, color, weight);
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying low.");
    }

    @Override
    public void saySomething() {
        System.out.println("Sparrow says chirp chirp!");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow is eating seeds.");
    }
}

