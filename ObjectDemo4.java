class Student implements Cloneable   //class Student extends Object implements Cloneable
{
    public String Name;
    public int Age;
    public int Marks;

    public Student(String A, int B,int C)
    {
        this.Name = A ; 
        this.Age = B;
        this.Marks = C;
    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }


}

class ObjectDemo4
{
    public static void main(String args[])
    {
        try
        {
            Student sobj = new Student("Sagar",21,89);  //Deep copy
            
            Student sobjX = (Student)sobj.clone();
            
            System.out.println("Name is :"+sobj.Name);
            System.out.println("Age is :"+sobj.Age);
            System.out.println("Marks is :"+sobj.Marks);

            System.out.println("Name is :"+sobjX.Name);
            System.out.println("Age is :"+sobjX.Age);
            System.out.println("Marks is :"+sobjX.Marks);
        }
        catch(Exception obj)
        {}

       // Student sobjX = sobj;  //Shallow copy
       
    }
}