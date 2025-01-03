public class Mouter {
    private int m = (int) (Math.random()*100);

    public void go(int x, final int y) {
        int a = x + y;
        final int b = x - y;

        class Minner {
            public void method() {
                System.out.println("m = " + m);
                System.out.println("m = " + x);
                System.out.println("m = " + y);
                System.out.println("m = " + a);
                System.out.println("m = " + b);
            }
        }
        Minner that =  new Minner();
        that.method();
    }
    public static void main(String[] args) {
        Mouter that = new Mouter();
        that.go((int)(Math.random()*100), (int)(Math.random()*100));
    }
}
