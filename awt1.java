import java.awt.*;
import java.awt.event.*;
class app extends Frame implements ActionListener {
     //GUI components
     TextField text;
     Button b;
     Label l;
     TextArea t2;

     app(){
         setTitle("GUI");
         setSize(400,300);
         setLayout(null);
         //label
         l=new Label("Enter Name");
         l.setBounds(50,25,100,30);
         //button
         b=new Button("Enter");
         b.setBounds(120,85,100,30);
         b.addActionListener(this);
         //textfield
         text=new TextField();
         text.setBounds(160,35,150,30);
         t2=new TextArea();
         t2.setBounds(160,120,150,50);


         add(l);
         add(text);
         add(b);
         add(t2);
         setVisible(true);

         addWindowListener(new WindowAdapter() {
             @Override
             public void windowClosing(WindowEvent e) {
                 dispose();
             }
         });
     }


     @Override
     public void actionPerformed(ActionEvent e) {
         String name=text.getText();
         t2.setText("Hello "+name);
         b.setBackground(Color.blue);
         b.setForeground(Color.white);
     }
     public static void main(String a[]){
         new app();
     }
 }