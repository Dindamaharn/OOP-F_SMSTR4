package MultiLevelInheritance;

public class Main {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.speak();
        b.fly();
        Penguin p = new Penguin();
        p.speak();
        p.fly();
    }
}
