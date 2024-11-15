interface Calculator
{
    void add(int a,int b);
    void subtract(int a,int b);
    void multiply(int a,int b);
    void division(int a,int b);
    
}
class Demo_Interface implements Calculator
{
    public void add(int a,int b)
    {
        int c=a+b;
        System.out.println("Addition is:"+c);
    }
    public void subtract(int a,int b)
    {
        int c=a-b;
        System.out.println("subtraction is:"+c);
    }
    public void multiply(int a,int b)
    {
        int c=a*b;
        System.out.println("multiplication is:"+c);
    }
    public void division(int a,int b)
    {
        int c=a/b;
        System.out.println("division is:"+c);
    }
    
    public static void main(String args[])
    {
        Demo_Interface d = new Demo_Interface();
        d.add(10,20);
        d.subtract(10,20);
        d.multiply(10,20);
        d.division(10,20);
        
    }

}