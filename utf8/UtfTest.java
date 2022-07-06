public class UtfTest
{
  public static void main(String[] args)
  {
    String str = new String("USER");
    System.out.println(str);
    System.out.println(str.length());

    try {
      byte[] bytes = str.getBytes("utf-8");
      System.out.println(bytes.length);
      for (int i=0; i<bytes.length; i++)
      {
        System.out.println(bytes[i]);
      }
    } catch (java.io.UnsupportedEncodingException e)
    {
      return ;
    }

    return ;
  }
}
