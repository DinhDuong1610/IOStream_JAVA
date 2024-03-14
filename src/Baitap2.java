import java.util.*;
import java.io.*;
public class Baitap2 {
  public static void main(String[] args) {
    new Baitap2();
  }

  public Baitap2() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập đường dẫn muốn xóa: ");
    String path = sc.nextLine();
    deleteFile(path);
  }

  public void deleteFile(String path) {
    try {
      File file = new File(path);
      if(file.isDirectory()) {
        for(File f : file.listFiles()) {
          deleteFile(f.getAbsolutePath());
        }
      }
      file.delete();
      // System.out.println("Xóa thành công!");
    } catch (Exception e) {
      System.out.println("Đường dẫn không chính xác!");
    }
  }
}
