import java.util.*;

class Collections2
{
    public static void main (String args[])
    {
        Stack <String> sobj = new Stack<String>();

        sobj.push("C Programming");     //It will add the stack
        sobj.push("C++ Programming");
        sobj.push("JAVA Programming");
        sobj.push("Python Programming");

        System.out.println(sobj);

        String ret = sobj.pop();   //It will remove the stack

        System.out.println(ret);   //It will only show removed stack
    }
}