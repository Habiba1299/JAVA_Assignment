import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

class Registration {
    JFrame f;
    JPanel p,pa,pb,p1,p2,p3,p4,p5,pB,pA,pA2,pR;
    JTextField name,phone,email,street_no,search,password;
    JTextArea allInfo,sInfo;
    JButton b1,b2,b3;

    public Registration(){

        f = new JFrame("registration");
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p = new JPanel();
        f.add(p);


        p1 = new JPanel();
        pR = new JPanel();
        pR.add(new JLabel(" REGISTRATION  "));
        p.add(pR);
        p1.add(new JLabel("Name: "));
        name= new JTextField(30);
        p1.add(name);
        p.add(p1);

        p2 = new JPanel();
        p2.add(new JLabel("Email: "));
        email= new JTextField(30);
        p2.add(email);
        p.add(p2);

        p3 = new JPanel();
        p3.add(new JLabel("Password: "));
        password= new JTextField(30);
        p3.add(password);
        p.add(p3);


        b1 = new JButton("Register");
        b2 = new JButton("Login");


        pB= new JPanel();
        p.add(pB);
        pB.add(b1);
        pB.add(b2);


        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String fName = name.getText();
                String fEmail = email.getText();
                String fPassword= password.getText();


                String newText = (fName+"  "+fEmail+"  "+fPassword);
                try{
                    FileWriter f = new FileWriter("LoginInfo.txt",true);
                    PrintWriter writer = new PrintWriter(f);

                    writer.println(newText);
                    writer.close();
                }catch (IOException e){
                    e.printStackTrace();
                }


            }
        });



        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                new Login();
            }
        });

        f.setVisible(true);

    }

    public static void main(String[] args) {

        new Registration();
    }
}
