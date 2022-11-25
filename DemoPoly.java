//              Dynamic Method Dispatch (Run time Polymorphism)
class DemoPoly {
    public static void main(String[] args) {
        Shape s;
        // s.draw();
        s=new Square();
        s.putdata();
        s.draw();
        s= new Rectangle();
        s.putdata();
        s.draw();
    }
}

abstract class Shape
{
    public void draw()
    {
        System.out.println("Nothing to draw");
    }
    abstract public void putdata();
    // {
    //     System.out.println("Nothing to initialize");
    // }

}
class Rectangle extends Shape
{
    private int l,b;
    public void putdata()
    {
        l=5;
        b=2;
    }
    public void draw()
    {
        System.out.println("Area of Rectangle =" +(l*b));
    }
}
class Square extends Shape
{
    private int l;
    public void putdata()
    {
        l=7;
    }
    public void draw()
    {
        System.out.println("Area of Square =" +(l*l));
    } 
}