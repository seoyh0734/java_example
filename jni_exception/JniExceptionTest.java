public class  JniExceptionTest
{
  static {
    System.loadLibrary("JniExceptionTest");
  }
  public static native void exception() throws Exception;
  public static void main(String[] argvs)
  {
    System.out.println("main start");
    try {
      exception();
    } catch (Exception e)
    {
      e.printStackTrace();
      System.exit(1);
    }
    System.out.println("main end");
    return ;
  }
}
