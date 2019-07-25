import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventThree extends Frame implements MouseListener  {

    public EventThree(){
        initComponents();
    }
    
    public void initComponents(){
        setLayout(new FlowLayout());
        t1=new TextField(10);
        t2=new TextField(10);
        add(t1); add(t2);
        t1.addMouseListener(this);
        
    }
    
    public static void main(String[] args) {
        EventThree ob=new EventThree();
        ob.setSize(400, 400);
        ob.setVisible(true);
    }
    
    TextField t1,t2;
    

    @Override
    public void mouseClicked(MouseEvent e) {
        int n=e.getClickCount();
        if(n==3){
            System.exit(0);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        setTitle("Pressed");
        int b=e.getButton();
        int x=e.getX();
        int y=e.getY();
        setTitle("Pressing Mouse @ "+x+","+y+","+b);
        
        
        //ft1.setText("#@#43");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        setTitle("Released");
        t1.setText("");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        setTitle("Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        setTitle("Exited");
    }

}
 