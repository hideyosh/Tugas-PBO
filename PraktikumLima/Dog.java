public class Dog extends Animal implements Pet {
    private String name;
    
    public Dog() {
        super(4);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void play() {
        System.out.println("Bermain tangkap stick kayu");
    }

    public void eat() {
        System.out.println("Makan daging");
    }

    @Override
    public void walk() {
        System.out.println("Jalan bersama tuannya");
    }
}
