
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;


public class FirstGUI {
    public static void main(String[] args) {

        //step-1 (creating a container)
        Frame f=new Frame();
        f.setSize(400, 300);
        f.setVisible(true);
        
        //step-2 (create the components)
        Label l1=new Label("Name");
        Label l2=new Label("Age");
        TextField t1=new TextField(10);
        TextField t2=new TextField(10);
        Button b1=new Button("Save");
        
        //step-3 (Add the components on container)
        //f.add("North",l1);  f.add("South",t1); 
        //changing LayoutManager
        //from Border to Flow
        
        //FlowLayout fL=new FlowLayout();
        //f.setLayout(fL);
        
        GridLayout gL=new GridLayout(3,2);
        f.setLayout(gL);
        
        
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
