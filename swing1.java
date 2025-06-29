import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class swing1 extends JFrame implements ActionListener {
    JLabel l;
    JButton b;
    JTextField text;
    JTextArea area;

    public swing1() {
        setTitle("Swing Example");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        l = new JLabel("Enter your name:");
        l.setBounds(50, 50, 150, 30);
        add(l);
        text = new JTextField();
        text.setBounds(200, 50, 150, 30);
        add(text);
        area = new JTextArea();
        area.setBounds(50, 100, 300, 50);
        add(area);
        b = new JButton("Submit");
        b.setBounds(150, 250, 100, 30);
        b.addActionListener(this);
        add(b);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = text.getText();
        area.setText("Hello, " + name + "!");
        b.setForeground(Color.RED);
        b.setBackground(Color.blue);
    }

    public static void main(String[] args) {
        new swing1();
    }
}
