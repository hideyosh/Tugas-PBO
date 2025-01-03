class Luar {
    private String outerVariable = "Variable Luar";
    
    class Dalam {k
        String innerVariable = "Variable Dalam";

        public void bicara() {
            System.out.println(innerVariable);
            System.out.println(outerVariable);
        }
    }
}

public class App {
    public static void main(String[] args) {
        Luar objLuar = new Luar();
        Luar.Dalam objDalam = objLuar.new Dalam();

        objDalam.bicara();
    }
}
