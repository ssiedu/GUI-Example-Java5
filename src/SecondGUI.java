import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

//Working without LayoutManager

public class SecondGUI {
    public static void main(String[] args) {

        //step-1 (creating a container)
        Frame f=new Frame();
        f.setSize(500, 400);
        f.setVisible(true);
        
        //step-2 (create the components)
        Label l1=new Label("Name");
        Label l2=new Label("Age");
        TextField t1=new TextField(10);
        TextField t2=new TextField(10);
        Button b1=new Button("Save");
        
        //step-3 (Add the components on container)
        f.setLayout(null);//disabling the default layout
        
        l1.setSize(60, 30);//width,height
        l1.setLocation(100, 100);//x,y
        
        t1.setSize(100, 30);
        t1.setLocation(200, 100);
        
        l2.setBounds(100,170, 60, 30);
        t2.setBounds(200,170,100,30);
        b1.setBounds(200,250,50,30);
        
        
        f.add(l1);  f.add(t1);
        f.add(l2);  f.add(t2);
        f.add(b1);
    }
}
/*
    Three Basic Steps
    ---------------------
1) Create a container
2) Create Components
3) Add components on container
*/
