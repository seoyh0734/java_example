
class ArrayTest {

  public static void main(String args[])
  {
    int[] a = new int[9];
    int cnt = 0;

    int seed = 0;
    for (int i=0; i<9; i++)
    {
      a[i] = seed++;
      System.out.println(a[i]);
    }

    return ;
  }
}
