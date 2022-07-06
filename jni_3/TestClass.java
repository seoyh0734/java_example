public class TestClass {
  static {
    System.loadLibrary("TestClass");
  }

  public static native int GetString(byte[] out, byte[] in, int inLen);

  public static int Mod(int a)
  {
    a = 10;
    return 0;
  }

  public static void main(String[] args)
  {
    System.out.println("main() start");

    byte[] out = new byte[10];
    byte[] in = new byte[10];
    int inLen = 10;

    int ret = GetString(out, in, inLen);
    System.out.println("ret : " + Integer.toString(ret));

    //for (int i=0; i<ret; i++)
    //{
    //  System.out.print(out[i]);
    //}
    System.out.print(out);


    return ;
  }
}
