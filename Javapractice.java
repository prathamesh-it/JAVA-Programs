interface Calculator
{
    void add(int a,int b);
    
}
class Demo_Interface implements Calculator
{
    public void add(int a,int b)
    {
        int c=a+b;
        System.out.println("Addition is:"+c);
    }
    
    public static void main(String args[])
    {
        Demo_Interface d = new Demo_Interface();
        d.add(10,20);
        
    }

}