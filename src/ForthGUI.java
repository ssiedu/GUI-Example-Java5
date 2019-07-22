
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

public class ForthGUI extends Frame {

    public ForthGUI(){
        initComponents();
    }
    
    public void initComponents(){
        setLayout(new FlowLayout());
        t1=new TextField(10);
        t2=new TextField(10);
        b1=new Button("Copy");
        b2=new Button("Clear");
        add(t1); add(t2);
        add(b1); add(b2);
        
    }
    
    public static void main(String[] args) {
        ForthGUI ob=new ForthGUI();
        ob.setSize(400, 400);
        ob.setVisible(true);
    }
    
    TextField t1,t2;
    Button b1,b2;
}
/*
    1) extends your class with frame.
    2) components are declared inside a class
        (rather then declaring in side method)
    3) the components are created in initComponent method.
    4) one constructor is created and
       initComponents is called inside constructor.






*/
