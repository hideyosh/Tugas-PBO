public class Jubah{
    private String name;
    private int strenght;
    private int health;

    public Jubah(String name, int strenght, int health){
        this.name = name;
        this.strenght = strenght;
        this.health = health;
    }

    public int getAddHealth(){
        return this.strenght * 10 + this.health;
    }

    public int getDefencePower(){
        return this.strenght * 2;
    }
}