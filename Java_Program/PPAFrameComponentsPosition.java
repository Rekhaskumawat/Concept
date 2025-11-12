import javax.swing.*;

class PPAFrameComponentsPosition
{
    public static void main (String A[])
    {
        JFrame fobj = new JFrame("PPA");
        JButton bobj = new JButton("ok");

        fobj.add(bobj);
        bobj.setBounds(100 , 100, 150, 50);
        fobj.setSize(300 ,300);

        fobj.setLayout(null);
        fobj.setVisible(true);

        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
    }
}

