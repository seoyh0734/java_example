import java.util.*;
import java.nio.ByteBuffer;

public class Main {

  static byte[] toBytes(int i) {
    return ByteBuffer.allocate(4).putInt(i).array();
  }

  static void printBytes(byte[] bytes) {
    for (byte b : bytes) {
      System.out.format("0x%x ", b);
    }
    System.out.print("\n");
  }

  static void printB(int i) {
    printBytes(toBytes(i));
  }

  public static void main(String[] args) {
    System.out.println("main()");

    int i=-1;

    printB(i >>> 8);

    byte b = -1 >> 2;
    System.out.format("0x%x\n", b);


    return ;
  }
}
