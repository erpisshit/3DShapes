import java.utils.*;

public class Cube
{
  
  int a;
  int[] org;
  int[] sides;
  public Cube(int a)
  {
    this.a = a;
    this.org = new int[2];
    this.sides = new int[6];
  }
  public void tArea()
  {
    long sd = this.a * this.a;
    long sd2 = 6*this.a;
    System.out.println("Total Surface area of cube is "+sd2);
  }
  public void colorCheck()
  {
    if (this.sides[0]==1)
    {
      System.out.println("Red");
    }
    else if (this.sides[1]==2)
    {
      System.out.println("Blue");
    }
    else if (this.sides[1]==3)
    {
      System.out.println("Green");
    }
    else
    {
      System.out.println("Rainbow");
    }
  }
  public static void main(Strings[] args)
  {
    Scanner jk = new Scanner(System.in);
    System.out.println("Enter Size of side of Cube");
    int a = jk.nextInt();
    Cube cb = new Cube(a);
  }

}
