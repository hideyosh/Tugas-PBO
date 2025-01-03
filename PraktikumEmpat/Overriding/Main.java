package Overriding;

public class Main {
    public static void main(String[] args) {
        bangunDatar BangunDatar = new bangunDatar();
        Persegi p = new Persegi(3);
        Segitiga s = new Segitiga(4, 4);
        Lingkaran el = new Lingkaran(7);
        
        BangunDatar.luas();
        BangunDatar.keliling();
        System.out.print("\n");
        System.out.println("Luas persegi: " + p.luas());
        System.out.println("keliling persegi: " + p.keliling());
        System.out.print("\n");
        System.out.println("Luas segitiga: " + s.luas());
        System.out.print("\n");
        System.out.println("Luas lingkaran: " + el.luas());
        System.out.println("keliling lingkaran: " + el.keliling());
    }
}
