import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EventTwo extends Frame implements KeyListener {

    public EventTwo(){
        initComponents();
    }
    
    public void initComponents(){
        setLayout(new FlowLayout());
        t1=new TextField(10);
        t2=new TextField(10);
        b1=new Button("Copy");
        b2=new Button("Clear");
        b3=new Button("Exit");
        add(t1); add(t2);
        add(b1); add(b2);add(b3);
        t1.addKeyListener(this);
    }
    
    public static void main(String[] args) {
        EventTwo ob=new EventTwo();
        ob.setSize(400, 400);
        ob.setVisible(true);
    }
    
    TextField t1,t2;
    Button b1,b2,b3;

    @Override
    public void keyTyped(KeyEvent e) {
        char ch=e.getKeyChar();
        if(ch=='@'){
            t2.setText("google.com");
        }
        
        
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        int code=e.getKeyCode();
        if(code==KeyEvent.VK_F1){  //F1
         String s1=t1.getText();
         String s2=s1.toUpperCase();
         t1.setText(s2);
        }else if(code==KeyEvent.VK_F2){    //F2
            String s1=t1.getText();
            String s2=s1.toLowerCase();
            t1.setText(s2);
        }else if(code==KeyEvent.VK_ESCAPE){
            t1.setText("");
        }else if(code==KeyEvent.VK_ENTER){
            System.exit(0);
        }
        
        
        
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
 