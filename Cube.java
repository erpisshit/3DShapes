import java.utils.*;
public class Cube
{
  int a;
  public Cube(int a)
  {
    this.a = a;
  }
  public void tArea()
  {
    long sd = this.a * this.a;
    long sd2 = 6*this.a;
    System.out.println("Total Surface area of cube is "+sd2);
  }
  public void sArea()
  {
    long sd = this.a * this.a;
    System.out.println("Surface area of cube is "+sd);
  }
  public void volume()
  {
    long vol = this.a*this.a*this.a;
  }
  public static void main(Strings[] args)
  {
    Scanner jk = new Scanner(System.in);
    System.out.println("Enter Size of side of Cube");
    int a = jk.nextInt();
  }

}
