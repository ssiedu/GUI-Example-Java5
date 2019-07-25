import java.awt.Button;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class EventFour extends Frame implements MouseMotionListener {

    public EventFour(){
        initComponents();
    }
    
    public void initComponents(){
        setLayout(null);
        b1=new Button("Click");
        b1.setBounds(50, 50, 60, 30);
        add(b1);
        addMouseMotionListener(this);
        
    }
    
    public static void main(String[] args) {
        EventFour ob=new EventFour();
        ob.setSize(400, 400);
        ob.setVisible(true);
    }

    
    Button b1;

    @Override
    public void mouseDragged(MouseEvent e) {
        int x=e.getX();
        int y=e.getY();
        setTitle("Dragged @ "+x+","+y);
        b1.setLocation(x, y);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x=e.getX();
        int y=e.getY();
        setTitle("Moved @ "+x+","+y);
        
    }
    

}
 