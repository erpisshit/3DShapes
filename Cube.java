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
  
  public static void main(Strings[] args)
  {
    Scanner jk = new Scanner(System.in);
    System.out.println("Enter Size of side of Cube");
    int a = jk.nextInt();
    Cube cb = new Cube(a);
  }

}
