
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;


public class ThirdGUI {
    public static void main(String[] args) {
        Frame f=new Frame();
        f.setSize(300, 300);
        f.setVisible(true);
        
        //step-2 (create the components)
        Label l1=new Label("Name");
        Label l2=new Label("Age");
        Label l3=new Label("Subjects");
        Label l4=new Label("Timings");
        TextField t1=new TextField(10);
        TextField t2=new TextField(10);
        Button b1=new Button("Save");
        Button b2=new Button("Cancel");
        Button b3=new Button("Exit");
        
        CheckboxGroup cbg1=new CheckboxGroup();
        CheckboxGroup cbg2=new CheckboxGroup();
        
        Checkbox c1=new Checkbox("Java",cbg1,true);
        Checkbox c2=new Checkbox("Php",cbg1,false);
        Checkbox c3=new Checkbox("Morning",cbg2,true);
        Checkbox c4=new Checkbox("Evening",cbg2,false);        
        
        Panel pSub=new Panel();
        pSub.setLayout(new FlowLayout());
        pSub.add(c1); pSub.add(c2);
        
        Panel pTime=new Panel();
        pTime.setLayout(new FlowLayout());
        pTime.add(c3); pTime.add(c4);
        
        
        Panel p1=new Panel();
        p1.setLayout(new GridLayout(4,2));
        
        Panel p2=new Panel();
        p2.setLayout(new FlowLayout());
        
        
        p1.add(l1);     p1.add(t1);
        p1.add(l2);     p1.add(t2);
        p1.add(l3);     p1.add(pSub);
        p1.add(l4);     p1.add(pTime);
        
        
        p2.add(b1); p2.add(b2); p2.add(b3);
        
        f.add("North",p1);
        f.add("South",p2);
        
        //p2.setBackground(Color.yellow);
        
        
    }
}
