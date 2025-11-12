import javax.swing.*;
import java.awt.event.*;

class MarvellousListener implements ActionListener
{
    public void actionPerformed(ActionEvent aobj)
    {
        System.out.println("Button clicked...");
    }
}
class EventhandlingSeperateClass
{

    public static void main(String Arr[])
    {
        JFrame fobj = new JFrame("PPA");
        JButton bobj = new JButton("ok");

        bobj.setBounds(100,100,150,50);
        bobj.addActionListener(new MarvellousListener());

        fobj.add(bobj);
        fobj.setSize(400,300);

        fobj.setLayout(null);

        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    
    }
}