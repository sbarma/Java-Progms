package example;

public class overload//overloading main method()
{
    public static void main(String[] args)
    {
        System.out.println("Execution starts from this method");
    }
 
    void main(int args)
    {
        System.out.println("Another main method");
    }
 
    double main(int i, double d)
    {
        System.out.println("Another main method");
 
        return d;
    }
}