import java.awt.Button;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EventSix extends Frame {

    
    public EventSix(){
        initComponents();
    
    }
    
    public void initComponents(){
        setLayout(null);
        b1=new Button("Click");
        b1.setBounds(50, 50, 60, 30);
        add(b1);
        addWindowListener(new MyWinCloser());        
        b1.addMouseListener(new MyMouseHandler());
    }
    
    public static void main(String[] args) {
        EventSix ob=new EventSix();
        ob.setSize(400, 400);
        ob.setVisible(true);
    }

    Button b1;


    class MyWinCloser extends WindowAdapter {
        public void windowClosing(WindowEvent e){
            System.exit(0);
        }
    }
    
    class MyMouseHandler extends MouseAdapter{
        public void mouseEntered(MouseEvent e){
            setTitle("Click To Save");
        }
        public void mouseExited(MouseEvent e){
            setTitle("");
        }
    }
    
    
}
 