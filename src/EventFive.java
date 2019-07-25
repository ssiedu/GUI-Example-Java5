import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileWriter;

public class EventFive extends Frame implements WindowListener {

    FileWriter writer;
    
    public EventFive(){
        initComponents();
        try{
            writer=new FileWriter("e:/data/mylogs.txt");
            System.out.println("File Opened");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void initComponents(){
        setLayout(null);
        b1=new Button("Click");
        b1.setBounds(50, 50, 60, 30);
        add(b1);
        addWindowListener(this);
    }
    
    public static void main(String[] args) {
        EventFive ob=new EventFive();
        ob.setSize(400, 400);
        ob.setVisible(true);
    }

    Button b1;


    @Override
    public void windowOpened(WindowEvent e) {
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try{
            writer.close();
            System.out.println("File Closed");
            System.out.println("Now Closing Window");
            System.exit(0);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {
        java.util.Date dt=new java.util.Date();
        String s="Activated : "+dt+"\n";
        System.out.println(s);
        try{
        writer.write(s);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        java.util.Date dt=new java.util.Date();
        String s="Dectivated : "+dt+"\n";
        System.out.println(s);
        try{
        writer.write(s);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    

}
 