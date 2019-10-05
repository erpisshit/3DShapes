class Sphere
{
  long r;
  public Sphere(long r)
  {
   this.r = r; 
  }
  public long Area()
  {
    return 4*Math.pi*r*r;
  }
  public long Volume()
  {
    return (4/3)*Math.pi*r*r*r;
  }
  public long Diameter()
  {
    return 2*r;
  }
}

