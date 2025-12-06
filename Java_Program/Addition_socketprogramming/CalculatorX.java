import javax.swing.*;
import java.awt.event.*;

class CalculatorListener implements ActionListener
{
    JFrame fobj;
    JButton bobj1 , bobj2 ,bobj3 , bobj4;
    JTextField tobj1 , tobj2;

    JLabel Number1 ,Number2 , Resultlabel ;

    public CalculatorListener(String title , int width , int height)
    {
        fobj = new JFrame(title);

        Number1 = new JLabel("Number1");
        Number1.setBounds(35, 50, 120, 30);

        tobj1 = new JTextField();
        tobj1.setBounds(150, 50, 50, 30);

        Number2 = new JLabel("Number2");
        Number2.setBounds(35, 100, 120, 30);

        tobj2 = new JTextField();
        tobj2.setBounds(150, 100, 50, 30);

        bobj1 = new JButton("+");
        bobj1.setBounds(35, 150, 50, 30);

        bobj2 = new JButton("-");
        bobj2.setBounds(95, 150, 50, 30);

        bobj3 = new JButton("*");
        bobj3.setBounds(155, 150, 50, 30);

        bobj4 = new JButton("/");
        bobj4.setBounds(215, 150, 50, 30);

        Resultlabel = new JLabel("Result :");
        Resultlabel.setBounds(100, 200, 100, 30);

        fobj.add(bobj1);
        fobj.add(bobj2);
        fobj.add(bobj3);
        fobj.add(bobj4);
        fobj.add(tobj1);
        fobj.add(tobj2);
        fobj.add(Number1);
        fobj.add(Number2);
        fobj.add(Resultlabel);

        bobj1.addActionListener(this);
        bobj2.addActionListener(this);
        bobj3.addActionListener(this);
        bobj4.addActionListener(this);

        fobj.setSize(width, height);
        fobj.setLayout(null);
        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    
    public void actionPerformed(ActionEvent aobj) 
    {
        int iResult = 0;
        
        String iNum1 = tobj1.getText();
        String iNum2 = tobj2.getText();

        int iValue1 = Integer.parseInt(iNum1);
        int iValue2 = Integer.parseInt(iNum2);
        

        if(aobj.getSource() == bobj1)
        {
            iResult =  iValue1 + iValue2 ;
            
        }
        else if(aobj.getSource() == bobj2)
        {
            iResult =  iValue1 - iValue2 ;
            
        }
        else if(aobj.getSource() == bobj3)
        {
            iResult =  iValue1 * iValue2 ;
            
        }
        else if(aobj.getSource() == bobj4)
        {
            iResult =  iValue1 / iValue2 ;
            
        }
        String sResult = Integer.toString(iResult);
        Resultlabel.setText("Result:"+sResult);

    }
}
class CalculatorX
{
    public static void main (String A[])
    {
        CalculatorListener cobj = new CalculatorListener("Calculator",300 ,300);
    }
}
