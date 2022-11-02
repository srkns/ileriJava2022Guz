package tr.edu.medipol.iju.ikincibolum;

public class Sinif1 {
  int x = 5;
  static int z = 20;

  int xKare() {
    return x*x;
  }

  static String sinif() {
    return "" + Sinif1.class;
  }

  public void setX(int i) {
    System.out.println("setX calisiyor");
    x = i;
    System.out.println("setX calisti");
  }
}
