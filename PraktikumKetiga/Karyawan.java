    public class Karyawan {
        protected String kodeKaryawan;
        protected String name;

        public Karyawan(String kodeKaryawan, String name){
            this.kodeKaryawan = kodeKaryawan;
            this.name = name;
        }

        public void absenPagi(){
            System.out.println(this.name + " absen pagi");
        }

        public void kerja(){
            System.out.println(this.name + " sedang kerja");
        }

        public void absenPulang(){
            System.out.println(this.name + " absen pulang");
        }

        public void getInfo(){
            System.out.println("Kode karyawan: " + this.kodeKaryawan);
            System.out.println("Nama karyawan: " + this.name);
        }    
    }
