import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

class Login {
    JFrame f;
    JPanel p,p1,p2,p3,p4,p5,pB,pA,pA2,pR;
    JTextField name,phone,email,street_no,search,password,show;
    JTextArea allInfo,sInfo;
    JButton b1,b2,b3;

    public Login(){

        f = new JFrame("login");
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p = new JPanel();
        f.add(p);


        p1 = new JPanel();
        pR = new JPanel();
        pR.add(new JLabel(" LOGIN  "));
        p.add(pR);
        p1.add(new JLabel("Email: "));
        email= new JTextField(30);
        p1.add(email);
        p.add(p1);

        p2 = new JPanel();
        p2.add(new JLabel("Password: "));
        password= new JTextField(30);
        p2.add(password);
        p.add(p2);



        b1= new JButton("Login");

        show= new JTextField(30);
        show.setText("Click login");


        pB= new JPanel();
        p.add(pB);
        pB.add(b1);

        pA= new JPanel();
        p.add(pA);
        pA.add(show);




        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                try {
                    FileReader file = new FileReader("LoginInfo.txt");
                    BufferedReader reader = new BufferedReader(file);

                    String line;
                    String femail = email.getText();
                    String fpassword = password.getText();

                    int n =1;
                    while((line= reader.readLine()) != null)
                    {
                        if(line.contains(femail) &&  line.contains(fpassword))
                            n=0;
                    }

                    if(n!=0) {
                        show.setText("LOGIN UNSUCESSFUL");
                    }
                    else {
                        show.setText("LOGIN SUCESSFUL");
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });


        f.setVisible(true);

    }


    public static void main(String[] args) {

        new Login();
    }
}
