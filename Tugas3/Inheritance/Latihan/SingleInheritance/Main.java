package SingleInheritance;

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.speak();
        Bird b = new Bird();
        b.speak();
        b.fly();
    }
}
