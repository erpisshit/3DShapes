import java.util.*
public class Cuboid
{
  long r;
  long p;
  long q;
  public Cuboid(long r, long p, long q)
  {
   this.r = r; 
   this.p = p; 
   this.q = q; 
  }
  public long Area(int a, int b)
  {
    return a*b;
  }
  public long Volume()
  {
    return this.r*this.p*this.q;
  }
    public long halfVolume()
  {
    return this.r*this.p*this.q/2;
  }
  public long totalSurfaceArea()
  {
    return 2*(this.r*this.p + this.r*this.q + this.p*this.q);
  }
  public static void main(Strings[] args)
  {
    Scanner jk = new Scanner(System.in);
    long r = jk.nextInt();
    long p = jk.nextInt();
    long q = jk.nextInt();
  }
}
