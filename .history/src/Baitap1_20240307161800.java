import java.util.*;
import java.io.*;
public class Baitap1 {
  public Baitap1() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập đường dẫn: ");
    String path  = sc.nextLine();
    File file = new File(path);
    System.out.println("Size of file: " + file.get);
  }
  public static void main(String[] args) {
    new Baitap1();
  }
}
