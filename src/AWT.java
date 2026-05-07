import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWT {
    public static void main(String[]args){
        Frame frame=new Frame("AWT Project");
        Label label=new Label("Enter your name");
        TextField tf=new TextField(20);
        Button b=new Button("Click");
        TextArea ta=new TextArea();
        Checkbox cb=new Checkbox();

        frame.setLayout(new FlowLayout());

        frame.add(label);
        frame.add(tf);
        frame.add(b);
        frame.add(ta);
        frame.add(cb);

        frame.setSize(300,150);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
