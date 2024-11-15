class Demo
{
    public Demo()
    {
        System.out.println("Inside Cosntructor");
    }

    protected void finalize()
    {
        System.out.println("Inside finalize method");
    }
}

class ObjectDemo3
{
    public static void main(String args[])
    {
       Demo obj = new Demo();
       obj=null;
       System.gc();

    }
}