package tr.edu.medipol.iju.ucuncubolum;

import java.util.Scanner;

class MyClass {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Kullanıcı adınızı girin :");

    String userName = myObj.nextLine();
    System.out.println("Kullanıcı adınız : " + userName);
  }
}
