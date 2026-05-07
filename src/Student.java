import java.awt.*;
import java.awt.event.*;

class StudentRegistration extends Frame {

    StudentRegistration() {

        // Frame settings
        setTitle("Student Registration Form");
        setSize(500, 500);
        setLayout(null);

        // Labels
        Label l1 = new Label("Student Registration");
        l1.setBounds(150, 40, 200, 30);
        l1.setFont(new Font("Arial", Font.BOLD, 18));

        Label l2 = new Label("Name:");
        l2.setBounds(50, 100, 100, 20);

        Label l3 = new Label("Roll No:");
        l3.setBounds(50, 140, 100, 20);

        Label l4 = new Label("Gender:");
        l4.setBounds(50, 180, 100, 20);

        Label l5 = new Label("Course:");
        l5.setBounds(50, 220, 100, 20);

        Label l6 = new Label("Address:");
        l6.setBounds(50, 260, 100, 20);

        // TextFields
        TextField tf1 = new TextField();
        tf1.setBounds(150, 100, 200, 20);

        TextField tf2 = new TextField();
        tf2.setBounds(150, 140, 200, 20);

        // Gender (Radio Buttons)
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox cb1 = new Checkbox("Male", cbg, false);
        Checkbox cb2 = new Checkbox("Female", cbg, false);

        cb1.setBounds(150, 180, 60, 20);
        cb2.setBounds(220, 180, 80, 20);

        // Course (Choice)
        Choice c = new Choice();
        c.add("BCA");
        c.add("BSc");
        c.add("BTech");
        c.add("MCA");
        c.setBounds(150, 220, 200, 20);

        // Address
        TextArea ta = new TextArea();
        ta.setBounds(150, 260, 200, 60);

        // Buttons
        Button b1 = new Button("Submit");
        b1.setBounds(150, 350, 80, 30);

        Button b2 = new Button("Reset");
        b2.setBounds(250, 350, 80, 30);

        // Add components to frame
        add(l1); add(l2); add(l3); add(l4); add(l5); add(l6);
        add(tf1); add(tf2);
        add(cb1); add(cb2);
        add(c);
        add(ta);
        add(b1); add(b2);

        // Close window


        setVisible(true);
    }

    public static void main(String[] args) {
        new StudentRegistration();
    }
}

