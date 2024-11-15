class Demo extends Thread
{
    public void run()
    {
        System.out.println("Thread is running with name : " + Thread.currentThread().getName());
        try
        {
            for(int i = 0; i < 10; i++)
            {
                System.out.println(Thread.currentThread().getName() + " with ID : "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception obj){}
    }
}

class ThreadDemo6
{
    public static void main(String args[])
    {
       System.out.println("Inside main method : "+Thread.currentThread().getName());
        
       Demo dobj1 = new Demo();
       Thread tobj1 = new Thread(dobj1);
       tobj1.setName("PPA");
       Demo dobj2 = new Demo();
       Thread tobj2 = new Thread(dobj2);
       tobj2.setName("LB");

       tobj1.start();
       tobj2.start();
       System.out.println("End of main thread...");
    }
}

/* 
OUTPUT:
Inside main method : main
End of main thread...
Thread is running with name : LB
Thread is running with name : PPA
LB with ID : 0
PPA with ID : 0
LB with ID : 1
PPA with ID : 1
PPA with ID : 2
LB with ID : 2
PPA with ID : 3
LB with ID : 3
PPA with ID : 4
LB with ID : 4
LB with ID : 5
PPA with ID : 5
LB with ID : 6
PPA with ID : 6
PPA with ID : 7
LB with ID : 7
PPA with ID : 8
LB with ID : 8
LB with ID : 9
PPA with ID : 9

*/

