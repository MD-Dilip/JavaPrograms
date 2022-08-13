
//This is java awt program

import  java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDBC extends Frame  implements ActionListener {
    Label l1,l2,l3;
    Button b1,b2,b3,b4,b5;
    TextField t1,t2;
    JDBC() {
        setLayout(null);
        setBackground(Color.ORANGE);
        l1 = new Label("Enter Name:");
        l2 = new Label("Enter Crime:");
        l3 = new Label("");
        b1 = new Button("INSERT");
        b2 = new Button("DELETE");
        b3 = new Button("UPDATE");
        b4 = new Button("CLEAR");
        t1 = new TextField(50);
        t2 = new TextField(50);


        l1.setBounds(150, 90, 150, 50);
        l2.setBounds(150, 120, 150, 50);
        l3.setBounds(300, 160, 250, 50);
        b1.setBounds(150, 220, 60, 50);
        b2.setBounds(210, 220, 60, 50);
        b3.setBounds(270, 220, 60, 50);
        b4.setBounds(330, 220, 60, 50);
        t1.setBounds(300, 100, 150, 25);
        t2.setBounds(300, 130, 150, 25);

        l1.setFont(new Font("Arial black", Font.BOLD, 15));
        l2.setFont(new Font("Arial black", Font.BOLD, 15));
        b1.setFont(new Font("Arial black", Font.BOLD, 15));
        t1.setFont(new Font("Arial black", Font.BOLD, 15));
        t2.setFont(new Font("Arial black", Font.BOLD, 15));


        b1.setBackground(Color.cyan);
        b2.setBackground(Color.RED);
        b3.setBackground(Color.gray);
        b4.setBackground(Color.yellow);

        add(l1);
        add(l2);
        add(l3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(t1);
        add(t2);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae)
    {
        String name = t1.getText();
        String crime = t2.getText();
        if (ae.getSource() == b1)
        {
            l3.setText("Data Inserted");
        }
        else if (ae.getSource() == b2)
        {
            l3.setText("Data Deleted");
        }
        else if (ae.getSource() == b3)
        {
            l3.setText("Data Updated");
        }
        else if (ae.getSource() == b4)
        {
            t1.setText("");
            t2.setText("");
//            l3.setText("");
        }

    }

    public static void main(String[] args) {
        JDBC fc = new JDBC();
        fc.setSize(600,350);
        fc.setVisible(true);
        fc.setTitle("first Calculator");
    }
}