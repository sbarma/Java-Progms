public class Box 
{
   private double length,breadth,height;
   
   
 //constructor
   
   public Box(double length,double breadth,double height) 
   {
	    this.length=length;
	    this.breadth=breadth;
	    this.height=height;
   }
   public void setLength(double l)
   {
	   length=l;
   }
   public void setBreadth(double b)
   {
	   breadth=b;
   }
   public void setHeight(double h)
   {
	   height=h;
   }
   public double volume()
   {
	   return length*breadth*height;
   }
   public static void main(String args[])
   {
	   Box b=new Box(10.0,10.0,10.0);
	   //b.setLength(10.0);
	   //b.setBreadth(10.0);
	   //b.setHeight(10.0);
	   System.out.println("Volume:"+b.volume());
	   
   }
   
   
   
   
   
   
   
   
   
   
   
   
}
