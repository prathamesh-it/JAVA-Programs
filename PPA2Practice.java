
class Base
{
    public int i,j;

    public void fun()
    {
        System.out.println("Inside base fun");
    }
    public Base()
    {
        System.out.println("Inside base constructor");
    }
}

class Derived extends Base    //class Derived : public Base
{
    public int X,Y;

    public void gun()
    {
        System.out.println("Inside Derived gun");
    }
    public Derived()
    {
        System.out.println("Inside Derived constructor");
    }
}

class PPA2Practice
{

    public static void main(String args[])
    {
        System.out.println("Inside main method");
        //Base bobj = new Base();
        Derived dobj=new Derived();

        dobj.fun();
        dobj.gun();



    }
}

