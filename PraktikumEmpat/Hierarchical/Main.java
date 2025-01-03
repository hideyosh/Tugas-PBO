package Hierarchical;

public class Main {
    public static void main(String[] args) {
        Karyawan wahyu = new Karyawan("Wahyu");
        Dosen amir = new Dosen("Amir");
        Staff melan = new Staff("Melan");

        wahyu.kerja();
        amir.kerja();
        melan.kerja();
    }
}
