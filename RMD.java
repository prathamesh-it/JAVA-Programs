
class Base
{
    public int A,B;
   
    public void Fun()
    {
        System.out.println("Inside Base Fun");
    }
    public void Gun()
    {
        System.out.println("Inside Base Gun");
    }
    public void Run()
    {
        System.out.println("Inside Base Run");
    }
    public void Sun()
    {
        System.out.println("Inside Base Sun");
    }

}

class Derived extends Base 
{   
    public int X,Y;

    public void Fun()
    {
        System.out.println("Inside Derived Fun");
    }
    public void Sun()
    {
        System.out.println("Inside Derived Sun");
    }
    public void Mun()
    {
        System.out.println("Inside Derived Mun");
    }
    public void Bun()
    {
        System.out.println("Inside Derived Bun");
    }

}

class RMD
{
    public static void main(String args[])
    {
        Base bobj=new Derived();         //Up casting
        
        bobj.Fun();            //Derived Fun
        bobj.Gun();            //Base Gun
        bobj.Sun();            //Derived Sun
        bobj.Run();            //Base Run
       // bobj.Mun();            //ERROR
       // bobj.Bun();            //ERROR
    }

}

//Base bobj=new Derived();       Up casting
//Base bobj=new Base();           No casting
//Derived dobj=new Derived();       No casting
//Derived dobj=new Base();           Downcasting