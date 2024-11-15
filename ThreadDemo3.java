class Demo implements Runnable
{
    public void run()
    {
        System.out.println("Thread is running");
    }
}

class ThreadDemo3
{
    public static void main(String args[])
    {
       System.out.println("Inside main method");
        
       Demo dobj = new Demo ();
       Thread tobj = new Thread(dobj);

       tobj.start();
    }
}