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

class Cube
{
	long l;
	public Cube(long l)
	{
		this.l=l
	}
	public long area(long l)
	{
		// surface area
		return 6*l*l;
	}

	public long volume(long l)
	{
		// volume
		return l*l*l;
	}

	public long diagonal(long l)
	{
		return Math.sqrt(3*l*l);
	}
}
