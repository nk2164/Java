public class Box implements Comparable<Box>
{
  private double length, height, depth;

  public Box( double length, double height, double depth )
  {
    this.length = length;
    this.height = height;
    this.depth  = depth;
  }

  public double volume()
  {
    return length*height*depth;
  }

  // compare this Box to another Box
  @Override
  public int compareTo( Box  otherBox ){

      if (this.volume() < otherBox.volume()) {
        return -1;
      }
      else if (this.volume() > otherBox.volume()) {
        return 1;
      }
      return 0;
    }

  public String toString()
  {
    return( "length: " + length + ",  height: " + height + ",  depth: " + depth + ",  volume: " + volume() );
  }
}
