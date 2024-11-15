import java.awt.*;
import java.awt.event.*;

class GUI3
{
    public static void main (String args[])
    {
        Frame fobj = new Frame("Marvellous PPA");
        fobj.setSize(400,400);
        fobj.setVisible(true);
        fobj.addWindowListener(new MarvellousListner());  
    }
}

class MarvellousListner extends WindowAdapter
{
    public void  windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }
    
}