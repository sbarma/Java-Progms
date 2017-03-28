package example;

public class Circle
{
	final double pi=3.14;
	double radius;
	public void setRadius(double r)
	{
		radius=r;
	}
	double Area()
	{
		return pi*radius*radius;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Circle c=new Circle();
c.setRadius(2.0);
System.out.println(c.Area());

}
}
