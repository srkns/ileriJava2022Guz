public class Metodlar2 {
    public static void main(String[] args) {
        new Metodlar2();
    }

    public Metodlar2() {
        int i = 4;
        System.out.println(sayi(i));

        Math.abs(3f);

    }

    private int sayi(int a) {
        a = a % 2;
        System.out.println("a=" + a);
        return a;
    }

}
