import java.util.*;
import java.sql.*;

public class P5Exception extends RuntimeException
{
  static {
    System.loadLibrary("P5Exception");
  }

  private static byte[] bmsg;
  private static String smsg;
  private static int err;

  public P5Exception()
  {
  }

  public P5Exception(byte[] s)
  {
    bmsg = s;
  }

  public P5Exception(String s)
  {
    smsg = s;
  }

  //public P5Exception(byte[] s,int i)
  public P5Exception(String s,int i)
  {
    System.out.println("P5Exception()");
    //System.out.println("s : " + s.toString());
    System.out.println("s : " + s);

    //bmsg = s;
    //err = i;
  }

  public int returnedValue()
  {
    return err;
  }

  public static void returnedString( byte[][] out )
  {
//  try
//  {
      String scert="";
      String msg = new String( bmsg );
      scert = " Code : "+err + " Reason : " + msg;
      out[0] = scert.getBytes();
//  } catch(java.io.UnsupportedEncodingException e1)
//  {
//    String msg = new String( " Reason : UnsupportedEncodingException" );
//    out[0] = msg.getBytes();
//  }
  }

  public String toString()
  {
    return "D'Amo Error " + smsg;
    //return "D'Amo Error " + bmsg.toString();
  }

  public static native void throwException();

  public static void main(String[] args)
  {
    System.out.println("Main Start");
    throwException();
    System.out.println("Main End");
    return ;
  }
}
