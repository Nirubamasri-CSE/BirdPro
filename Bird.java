public abstract class Bird {
    private String name;
    private String color;
    private int weight;

    public Bird(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public int getWeight() { return weight; }
    public void setWeight(int weight) { this.weight = weight; }

    public abstract void fly();
    public abstract void saySomething();
    public abstract void eat();
}
