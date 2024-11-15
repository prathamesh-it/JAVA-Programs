
class ObjectDemo6
{
    public static void main(String args[])
    {
       String s1 = "Marvellous";
       String s2 =  new String("Marvellous");

       if(s1 == s2)  //its compares the hashcode not String
       {
        System.out.println("Strings are equal");
       }
       else
       {
        System.out.println("Strings are different");
       }

       if(s1.equals(s2))   //it compares the content
       {
        System.out.println("Strings are equal");
       }
       else
       {
        System.out.println("Strings are different");
       }
    }
}