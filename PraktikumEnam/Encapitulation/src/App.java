public class App {
    public static void main(String[] args) throws Exception {
        
        Jagoan jakaSembung = new Jagoan("Jaka Sembung");
        Jubah jubahPutih = new Jubah("Jubah Putih", 7, 50);
        Senjata golok = new Senjata("Golok", 25);
        jakaSembung.setJubah(jubahPutih);
        jakaSembung.setSenjata(golok);

        Jagoan pitung = new Jagoan("Pitung");
        Jubah jubahHitam = new Jubah("Jubah Hitam", 8, 52);
        Senjata toya = new Senjata("Toya", 24);
        pitung.setJubah(jubahHitam);
        pitung.setSenjata(toya);

        jakaSembung.display();
        pitung.display();
        System.out.println("LETS GO TO BATTLE");
        System.out.println("=======================");
        
        jakaSembung.display();
        pitung.display();

        jakaSembung.attack(pitung);
        pitung.attack(jakaSembung);
        pitung.attack(jakaSembung);    
    }
}
 