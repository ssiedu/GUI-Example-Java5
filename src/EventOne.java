import java.awt.Button;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class EventOne extends Frame implements ActionListener, TextListener, FocusListener, ItemListener {

    public EventOne(){
        initComponents();
    }
    
    public void initComponents(){
        setLayout(new FlowLayout());
        ch=new Choice();
        ch.add("MP");
        ch.add("MH");
        ch.add("RJ");
        add(ch);
        ch1=new Choice();
        add(ch1);
        t1=new TextField(10);
        t2=new TextField(10);
        b1=new Button("Copy");
        b2=new Button("Clear");
        b3=new Button("Exit");
        add(t1); add(t2);
        add(b1); add(b2);add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        t1.addTextListener(this);
        b3.addFocusListener(this);
        ch.addItemListener(this);
    }
    
    public static void main(String[] args) {
        EventOne ob=new EventOne();
        ob.setSize(400, 400);
        ob.setVisible(true);
    }
    
    TextField t1,t2;
    Button b1,b2,b3;
    Choice ch, ch1;

    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==b1){
            String s=t1.getText();
            t2.setText(s);
        }else if(e.getSource()==b2){
            t1.setText("");
            t2.setText("");
        }else if(e.getSource()==b3){
            System.exit(0);
        }
    }

    @Override
    public void textValueChanged(TextEvent e) {
        String s=t1.getText();
        int n=s.length();
        t2.setText("Chars : "+n);
    }

    
    public void focusGained(FocusEvent e) {
        setTitle("You Are Closing Now");
    }
    public void focusLost(FocusEvent e) {
        setTitle("");
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        int n=ch.getSelectedIndex();
        String capital="";
        switch(n){
            case 0:
                capital="Bhopal";
            break;
            case 1:
                capital="Mumbai";
            break;
            case 2:
                capital="Jaipur";
            break;
        }
        setTitle(capital);
    }
}
