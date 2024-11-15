class Command
{
    public static void main(String Arg[])
    {
        System.out.println("Number of command line arguments are: "+Arg.length);

        /*System.out.println(Arg[0]);
        System.out.println(Arg[1]);
        System.out.println(Arg[2]);*/

        for(int i =0 ;i < Arg.length;i++)
        {
            System.out.println(Arg[i]);
        }
    }
}

//javac Command.java
//java Command Hello 21 Marvellous



/*
OUTPUT:OUTPUT AT 1ST SOP
C:\Users\hp\Desktop\PPA-2>javac Command.java

java Command.java
Number of command line arguments are: 0

java Command Hello
Number of command line arguments are: 1

java Command Hello 21
Number of command line arguments are: 2

java Command Hello 21 Marvellous
Number of command line arguments are: 3

*/

/*
Output: output AFTER 1ST SOP
C:\Users\hp\Desktop\PPA-2>java Command Hello 21 Marvellous
Number of command line arguments are: 3
Hello
21
Marvellous

*/


/*
OUTPUT: FOR LOOP
javac Command.java

java Command
Number of command line arguments are: 0

java Command PPA
Number of command line arguments are: 1
PPA

java Command PPA LB
Number of command line arguments are: 2
PPA
LB

java Command PPA LB ANGULAR
Number of command line arguments are: 3
PPA
LB
ANGULAR

java Command PPA LB ANGULAR PYTHON
Number of command line arguments are: 4
PPA
LB
ANGULAR
PYTHON

*/
