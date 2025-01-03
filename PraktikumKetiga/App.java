public class App {
    public static void main(String[] args) throws Exception {
        Karyawan ridho = new Karyawan("12345", "Ridho");
        Karyawan melan = new Karyawan("12346", "Melan");

        System.out.println("========== INFO KARYAWAN ==========");
        ridho.getInfo();
        melan.getInfo();
        System.out.println("===================================");

        System.out.println("\n========== ABSEN DAN KERJA KARYAWAN ==========");
        ridho.absenPagi();
        ridho.kerja();
        melan.absenPagi();
        melan.kerja();
        ridho.absenPulang();
        melan.absenPulang();
        System.out.println("==============================================");

        Dosen andiani = new Dosen("23455", "332211", "Andiani");
        Dosen ionia = new Dosen("23456", "332212", "Ionia");

        System.out.println("\n========== INFO DOSEN ==========");
        andiani.getInfo();
        ionia.getInfo();
        System.out.println("================================");

        System.out.println("\n========== ABSEN DAN KERJA DOSEN ==========");
        andiani.absenPagi();
        andiani.ngajar();
        ionia.absenPagi();
        ionia.kerja();
        ionia.absenPulang();
        andiani.absenPulang();
        System.out.println("===========================================");
    }
}
