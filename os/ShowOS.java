public class ShowOS
{
  public enum OS_TYPE {
    LINUX,
    WINDOWS,
    SUNOS,
    HP_UX_IA,
    HP_UX_PA,
    AIX
  }

  public String getOsName()
  {
    return System.getProperty("os.name").toLowerCase();
  }

  public String getOsVersion()
  {
    return System.getProperty("os.version").toLowerCase();
  }

  public OS_TYPE getOsType()
  {
    return LINUX;
  }

  public static void main(String[] args)
  {
    return ;
  }
}
