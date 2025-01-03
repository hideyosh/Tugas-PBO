public class Jagoan{
    private String name;
    private int baseHealth;
    private int baseAttack;
    private int level;                                                                                                                                                                                                                                               
    private int incrementHealth;
    private int incrementAttack;
    private int totalDamage;
    private boolean isAlive;

    // Ini adalah object member
    private Jubah Jubah;
    private Senjata Senjata;

    public Jagoan(String name){
        this.name = name;
        this.baseHealth = 100;
        this.baseAttack = 100;
        this.level = 1;
        this.incrementHealth = 20;
        this.incrementAttack = 20;
        this.isAlive = true;
    }

    public String getName(){
        return this.name;
    }

    public int getHealth(){
        return this.maxHealth() - this.totalDamage;
    }

    public void display(){
        System.out.println("Jagoan\t\t: " + this.name);
        System.out.println("Level\t\t: " + this.level);
        System.out.println("Health\t\t: " + this.getHealth() + "/" + this.maxHealth());
        System.out.println("Attack\t\t: " + this.getAttackPower()); 
        if(isAlive == false) {
            System.out.println("Alive\t\t: " + "Sudah Mati" + "\n");
        } else {
            System.out.println("Alive\t\t: " + "Masih Hidup" + "\n");
        }
    }

    public void setJubah(Jubah Jubah){
        this.Jubah = Jubah;
    }

    public void setSenjata(Senjata Senjata){
        this.Senjata = Senjata;
    }

    public int maxHealth(){ 
        return this.baseHealth + this.level * this.incrementHealth + this.Jubah.getAddHealth();
    }

    public void attack(Jagoan opponent){
        // Hitung damage 
        int damage = this.getAttackPower();

        // print event
        System.out.println("Jagoan " + this.name + " is Attacking " + opponent.getName() + " " +  damage + "\n");
        
        // attack si opponent
        opponent.defence(damage);

        this.levelUp();
    }

    private int getAttackPower(){
        return this.baseAttack + this.level * this.incrementAttack + this.Senjata.getAttack();
    }

    public void defence(int damage){

        // receive damage
        int defencePower = this.Jubah.getDefencePower();
        int deltaDamage;

        System.out.println(this.name + " defence power = " + defencePower);
        if (damage > defencePower)
        {
            deltaDamage = damage - defencePower;
        }
        else
        {
            deltaDamage = 0;
        }
        
        System.out.println("damage earned = " + deltaDamage + "\n");

        // adding total damage
        this.totalDamage += deltaDamage;

        // check is alive
        if (this.getHealth() <= 0)
        {
            this.isAlive = false;
            this.totalDamage = this.maxHealth(); 
        }

        this.display();
    }

    private void levelUp(){
        this.level++;
    }

}