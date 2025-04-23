public class APLine
{
  private int a, b, c;
  public APLine(int A, int B, int C) {
    a=A;
    b=B;
    c=C;
  }
  public double getSlope() {
    return -1 * ((double)a/b);
  }
  public boolean isOnline(int x, int y) {
    if((a*x)+(b*y)+c==0) {
      return true;
    }
    return false;
  }
  
}
