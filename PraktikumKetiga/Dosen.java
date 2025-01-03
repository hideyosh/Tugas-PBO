public class Dosen extends Karyawan {
    private String NIDN;

    public Dosen(String kodeKaryawan, String NIDN, String name){
        super(kodeKaryawan, name);
        this.NIDN = NIDN;
    }

    public void setNIDN(){
        this.NIDN = NIDN;
    }

    public void getNIDN(){
        System.out.println("NIDN " + this.NIDN);
    }

    public void ngajar(){
        System.out.println(this.name + " sedang ngajar");
    }

    public void getInfo(){
        super.getInfo();
        System.out.println("NIDN: " + this.NIDN);
    }    
    
}
