
import javax.swing.*;
import java.awt.event.*;

public class Example extends JFrame {
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1;
    //Default constructor
    Example(){}
    Example(String str){
        super(str);
    }
    public void setComponents(){
        l1=new JLabel("Addition of two numbers");
        l2=new JLabel("first number");
        l3=new JLabel("second number");
        l4=new JLabel();
        t1=new JTextField();
        t2=new JTextField();
        b1=new JButton("Add");
        setLayout(null);
        l1.setBounds(50,50,200,20);
        l2.setBounds(50,80,100,20);
        l3.setBounds(50,130,100,20);
        l4.setBounds(50,200,200,20);
        t1.setBounds(150,80,100,20);
        t2.setBounds(150,130,100,20);
        b1.setBounds(80,180,100,20);
        b1.addActionListener(new Handler());
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(b1);
    }
    class Handler implements ActionListener{
        //This function automatically call when the button is clicked
        //because of the implementation of ActionListener
        public void actionPerformed(ActionEvent e){
            int n1=Integer.parseInt(t1.getText());
            int n2=Integer.parseInt(t2.getText());
            int sum=n1+n2;
            l4.setText("Sum of "+n1+" and "+n2+" is "+sum);
        }
        
    }
    public static void main(String[]args){
        //we can pass the name of title inside the constructor
        Example jf=new Example("Swing Example");
        jf.setComponents();
        jf.setSize(300,300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
