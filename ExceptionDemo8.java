import java.io.*;

class DemoException7
{
    public static void main (String args[]) throws IOException
    {
        try{
            BufferedReader bobj = new BufferedReader(new InputStreamReader (System.in));

            System.out.println("Enter your name : ");
            String name = bobj.readLine();

            System.out.println("Enter your age  :");
            int Age = Integer.parseInt (bobj.readLine());;

            System.out.println("Your name : "+name);
            System.out.println("Your age : "+Age);
        }
        catch(Exception obj)
        {}        
    }
}