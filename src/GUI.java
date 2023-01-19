import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.AbstractList;
import java.util.ArrayList;

public class GUI implements ActionListener {
    private int count = 0;
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JLabel user;
    private JLabel passWordLable;
    private JButton button;
    private JPasswordField passWord;
    private JTextField userName;
    private JLabel sucess;
    private AbstractList<Customer> customer;
    public void addCustomer (Customer a){
        if(customer == null){
            customer = new ArrayList<Customer>();
        }
        customer.add(a);
    }
    public AbstractList<Customer> getCustomer() {
        return customer;
    }

    public GUI(){
        //inside frame
        frame = new JFrame();
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));



        //userName

        user = new JLabel("User: ");
        user.setBounds(5,40, 80,25);
        userName = new JTextField(20);
        userName.setBounds(10,50, 80,25);
        panel.add(user);
        panel.add(userName);

        //passWord
        passWordLable = new JLabel("Password: ");
        passWordLable.setBounds(10,40, 80,25);
        passWord = new JPasswordField(20);
        passWord.setBounds(10,50, 60,15);
        panel.add(passWordLable);
        panel.add(passWord);

        //button
        button = new JButton("Log in");
        button.setBounds(10,40, 80,25);
        label = new JLabel("Number of Clicks");
        panel.add(button);

        //text if pass the login
         sucess = new JLabel("Success!");
         sucess.setBounds(10,40, 180,125);
         frame.add(sucess);


        //frame
        frame.add(panel);
        frame.setTitle("Banking");
        frame.getDefaultCloseOperation();
        frame.pack();
        frame.setVisible(true);
        button.addActionListener(this);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
    count++;
        System.out.println("button clicked");

        String user = userName.getText();
        String passwords = passWord.getText();
        System.out.println(user + passwords);

        for (Customer a : customer){
            if((user + passwords).equals(a.getPassword())){
                JPanel page2 = new JPanel();
                frame.add(page2);
                panel.remove(button);
                panel.remove(userName);
                panel.remove(passWord);

                //button
                button = new JButton("Log out");
                button.setBounds(10,40, 80,25);
                panel.add(button);


                JLabel name = new JLabel();
                name.setText(a.getFirstName() + " "+ a.getLastName());
                sucess.setText(String.valueOf(a.getBalance()));
                page2.add(name);
                page2.add(sucess);
            }
        }

    }
}
