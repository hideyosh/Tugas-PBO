public class Main {
    public static void main(String[] args) {
        Spider spider1 = new Spider();
        spider1.eat();

        Dog dog1 = new Dog();
        dog1.setName("henry");
        System.out.println("Nama anjing saya " + dog1.getName());
        dog1.play();
        dog1.eat();
        dog1.walk();    
        
        Cat cat1 = new Cat("rais");
        System.out.println("Nama kucing saya " + cat1.getName());
        cat1.play();
        cat1.eat();
        cat1.walk();
    }
}
