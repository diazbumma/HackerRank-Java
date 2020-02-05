package advanced;

class Singleton{

    private static final Singleton SINGLETON_INSTANCE = new Singleton();

    public String str;

    private Singleton() {};

    public static Singleton getSingleInstance() {
        return SINGLETON_INSTANCE;
    }
} // The answer for HackerRank ends here. Main method below just for testing the singleton instance.

public class SingletonPattern {

    public static void main(String[] args) {
        // instantiating Singleton class with variable x
        Singleton x = Singleton.getSingleInstance();

        // instantiating Singleton class with variable y
        Singleton y = Singleton.getSingleInstance();

        // instantiating Singleton class with variable z
        Singleton z = Singleton.getSingleInstance();

        x.str = "Hello I am a singleton! Let me say hello world to you";

        System.out.println("String from x is " + x.str);
        System.out.println("String from y is " + y.str);
        System.out.println("String from z is " + z.str);
    }
}
