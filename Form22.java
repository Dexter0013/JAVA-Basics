import java.awt.*;                //Importing AWT classes
import javax.swing.*;            //Importing Swing classes
import java.awt.event.*;        //Importing AWT event classes
 
class MyFrame1 extends JFrame implements ActionListener {
    // GRAPHICAL USER INTERFACE COMPONENTS
    private Container c;                            // Main container
    private JLabel title;                           //Form Title
    private JLabel name;                            //Name Label 
    private JTextField tname;                       // Name Input Area
    private JLabel gender;                          //Gender Label
    private JRadioButton male;                      //Male Radio Button
    private JRadioButton female;                    //Female Radio Button
    private ButtonGroup gengp;                      //Group for Radio Buttons
    private JButton submit;                         //Form Submit Button
    private TextArea tout;                          //Text Area for Output
    private JLabel background;                      // Background image label
    private JLabel country;                         // Country Label
    private JComboBox<String> countryDropdown;      // Dropdown for country selection
    private JCheckBox termsCheckBox;                // Terms and Conditions Checkbox
    private ImageIcon img;                          // Background image
 
    // Constructor
    public MyFrame1() {
        // Frame properties
        setTitle("Login Form");
        setBounds(300, 90, 488, 750);
        setResizable(false);

        // Main container
        c= getContentPane();
        c.setLayout(null);
        c.setBackground(Color.black); // Set background color to black

        // Form Title
        title = new JLabel("Login Form");
        title.setFont(new Font("Serif", Font.BOLD, 60));  // Fixed font name typo
        title.setSize(350, 70);
        title.setLocation(90, 0);
        title.setForeground(Color.yellow); // Set text color to purple
        c.add(title);

        // Name Label
        name = new JLabel("Name:");
        name.setFont(new Font("Serif", Font.BOLD, 50));
        name.setSize(150, 40);
        name.setForeground(Color.magenta); // Set text color to white
        name.setLocation(5, 80);
        c.add(name);

        // Name Input Area
        tname = new JTextField();
        tname.setFont(new Font("Serif", Font.BOLD, 20));
        tname.setSize(220, 28);
        tname.setLocation(220, 90);
        tname.setBackground(Color.BLUE);
        tname.setForeground(Color.white); // Set text color to white
        c.add(tname);

        // Gender Label
        gender = new JLabel("Gender:");
        gender.setFont(new Font("Serif", Font.BOLD, 50));
        gender.setSize(185, 40);
        gender.setLocation(5, 134);
        gender.setForeground(Color.magenta);
        c.add(gender);

        // Male Radio Buttons
        male = new JRadioButton("Male");
        male.setFont(new Font("Serif", Font.BOLD, 18));
        male.setSelected(true);
        male.setForeground(Color.cyan);
        male.setBackground(Color.black);;
        male.setSize(75, 20);
        male.setLocation(220, 150);
        c.add(male);

        //Female Radio Buttons
        female = new JRadioButton("Female");
        female.setFont(new Font("Serif", Font.BOLD, 18));
        female.setSize(90, 20);
        female.setForeground(Color.cyan);
        female.setBackground(Color.black);;
        female.setLocation(304, 150);
        c.add(female);

        //Group for Radio Buttons
        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);

        //Country Label
        country = new JLabel("Country:");
        country.setFont(new Font("Serif", Font.BOLD, 50));
        country.setSize(198, 43);
        country.setForeground(Color.magenta);
        country.setLocation(5, 188);
        c.add(country);

        String[] countries = {"USA", "UK", "India", "Canada"};
        countryDropdown = new JComboBox<>(countries);
        countryDropdown.setFont(new Font("Serif", Font.BOLD, 20));
        countryDropdown.setSize(190, 28);
        countryDropdown.setLocation(220, 200);
        countryDropdown.setBackground(Color.blue);
        countryDropdown.setForeground(Color.white);
        c.add(countryDropdown);

        // Text Area for Output
        tout = new TextArea("");
        tout.setFont(new Font("Serif", Font.BOLD, 22));
        tout.setSize(380, 120);
        tout.setLocation(40, 420);
        tout.setBackground(Color.blue);
        tout.setForeground(Color.white);
        c.add(tout);

        // Terms and Conditions Checkbox
        termsCheckBox = new JCheckBox("Agree and Continue");
        termsCheckBox.setFont(new Font("Serif", Font.BOLD, 18));
        termsCheckBox.setSize(180, 30);
        termsCheckBox.setLocation(140, 282);
        termsCheckBox.setForeground(Color.cyan);
        termsCheckBox.setBackground(Color.black);
        c.add(termsCheckBox);

        //Form Submit Button
        submit = new JButton("Submit");
        submit.setFont(new Font("Serif", Font.BOLD, 20));
        submit.setSize(150, 30);
        submit.setBackground(Color.red);
        submit.setForeground(Color.white);
        submit.setLocation(155, 320);
        submit.addActionListener(this);
        c.add(submit);

        // Background Image
        img = new ImageIcon("c:\\Users\\deepr\\OneDrive\\Work2\\JAVA\\Firstjava\\src\\c.gif"); // Use absolute path if needed
        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(150, 550, 190, 130); // Set size to match the frame
        c.add(background);
        background.setLayout(null); // Set layout to null for absolute positioning

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    // Action Listener for Submit Button
    // This method is called when the button is clicked
    //Overide Action method Performed
    @Override
    public void actionPerformed(ActionEvent e) {
        if(termsCheckBox.isSelected()) {
            // Checkbox is selected
            // You can add any additional logic here if n
        if (e.getSource() == submit) {
            // Text Captured
            String data = "Name: " + tname.getText() + "\n";
            data += "Gender: " + (male.isSelected() ? "Male" : "Female") + "\n";
            data += "Country:" + countryDropdown.getSelectedItem() +"\n";
            //Text Output
            tout.setText(data);
        }}
        else {
            // Checkbox is not selected
            JOptionPane.showMessageDialog(this, "Accept the terms and conditions.");
            return; // Exit the method if checkbox is not selected
        }
    }
}

// Main class
public class Form22 {
    public static void main(String[] args) {
         new MyFrame1();
    }
}