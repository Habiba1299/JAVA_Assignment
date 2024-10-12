import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

class AdressBook {
    JFrame f;
    JPanel p,p1,p2,p3,p4,p5,pB,pA,pA2;
    JTextField name,phone,email,street_no,search;
    JTextArea allInfo,sInfo;
    JButton b1,b2,b3;

    public AdressBook(){

        f = new JFrame("Adress Boook");
        f.setSize(500, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p = new JPanel();
        f.add(p);

        //pw = new JPanel();
        //pe = new JPanel();
        //p1.add(pw);
        p1 = new JPanel();
        p1.add(new JLabel("name: "));
        name= new JTextField(30);
        p1.add(name);
        p.add(p1);

        p2 = new JPanel();
        p2.add(new JLabel("Email: "));
        email= new JTextField(30);
        p2.add(email);
        p.add(p2);

        p3 = new JPanel();
        p3.add(new JLabel("Phone: "));
        phone= new JTextField(30);
        p3.add(phone);
        p.add(p3);

        p4= new JPanel();
        p4.add(new JLabel("Street no: "));
        street_no= new JTextField(30);
        p4.add(street_no);
        p.add(p4);



        //allInfo = new JTextArea(30,10);


        b1 = new JButton("SAVE");
        b2 = new JButton("Show all Info");

        pB= new JPanel();
        p.add(pB);
        pB.add(b1);
        pB.add(b2);

        pA= new JPanel();
        allInfo = new JTextArea(10,30);
        pA.add(allInfo);
        p.add(pA);


        p5 =  new JPanel();
        search = new JTextField(30);
        p5.add(search);

        b3 = new JButton("Search");
        p5.add(b3);
        p.add(p5);



        pA2= new JPanel();
        sInfo = new JTextArea(5,30);
        pA2.add(sInfo);
        p.add(pA2);

        int count =0;

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String fName = name.getText();
                String fEmail = email.getText();
                String fPhone = phone.getText();
                int fStreet_no = Integer.parseInt(street_no.getText());

                String newText = (fName+"  "+fEmail+"  "+fPhone+"  "+fStreet_no);
                try{
                    FileWriter f = new FileWriter("Adress_Book.txt",true);
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

                try {
                    FileReader f = new FileReader("Adress_Book.txt");
                    BufferedReader reader = new BufferedReader(f);

                    String line ;

                       int n =0;
                    while((line= reader.readLine()) != null)
                    {
                        if(n == 0)
                           allInfo.setText(line);
                    }


                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });



        b3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                try {
                    FileReader file = new FileReader("Adress_Book.txt");
                    BufferedReader reader = new BufferedReader(file);

                    String line;
                    String fsearch = search.getText();

                    while((line= reader.readLine()) != null)
                    {

                        if(line.contains(fsearch))
                            sInfo.setText(line);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        f.setVisible(true);

    }

    public static void main(String[] args) {

        new AdressBook();
    }
}
