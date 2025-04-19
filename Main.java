public class Main {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow("Sparrow", "Brown", 1);
        Bird eagle = new Eagle("Eagle", "Golden", 5);
        Bird dolphin = new Dolphin("Dolphin", "Gray", 100);

        sparrow.fly();
        eagle.fly();
        dolphin.fly();

        sparrow.saySomething();
        eagle.saySomething();
        dolphin.saySomething();

        sparrow.eat();
        eagle.eat();
        dolphin.eat();
    }
}
