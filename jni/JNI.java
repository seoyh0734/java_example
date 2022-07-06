public class JNI {
  static {
    System.loadLibrary("JNI");
  }

  private native byte[] getByteArray();
  private native void printHello();
  private native void releaseByteArray(byte[] target);

  public static void main(String[] args)
  {
    //for (int i=0; i<10000; i++)
    while(true)
    {
      JNI jni = new JNI();
      //jni.printHello();
      //System.out.println("getIntArray : " + String.valueOf(jni.getIntArray()));
      //long clong = jni.getIntArray();
      byte[] bArr = jni.getByteArray();
      //try {
      //  Thread.sleep(10);
      //} catch (InterruptedException e) {
      //  e.printStackTrace();
      //}
      for (int i=0; i<10; i++)
      {
      //  System.out.println(bArr[i]);
        bArr[i]+=1;
      }
    }
  }
}
