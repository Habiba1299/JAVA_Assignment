import java.util.Scanner;
import java.util.logging.SocketHandler;

public class  AdressBook{

    private int serial_no;
    private String name;
    private String adress;

    Scanner sc = new Scanner(System.in);

    AdressBook(){
        this.serial_no = serial_no;
        this.name =name;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName() {

        System.out.print("Name: ");
        String name = sc.nextLine();
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress() {

        System.out.print("Adress: ");
        String adress = sc.nextLine();
        this.adress = adress;
    }

    public void display(){
        System.out.println("Serial number : "+serial_no);
        System.out.println("Name : "+name);
        System.out.println("Adress : "+adress);

    }

    static void deleteRecord(AdressBook adressbook) {
        adressbook.name = null;
        adressbook.adress= null;
    }

    static void updateRecord(AdressBook adressbook){
        Scanner sc = new Scanner(System.in);

        System.out.println("\n1. change name-----2. change adress----3. change both\nEnter your choice" );

       int c= sc.nextInt();

       if(c == 1) {
           adressbook.setName();
       }
       else if(c == 2) {
           adressbook.setAdress();
       }

       else {
           adressbook.setName();
           adressbook.setAdress();
       }
    }



        public static void main(String[] args) {

        int s,no,i=0,m;

        Scanner sc = new Scanner(System.in);

        System.out.println("how many adress you want to put:");
        m = sc.nextInt();

        AdressBook [] adressbook = new AdressBook[m];

        do {

            System.out.print("------\n1. new record \n2. update record\n3. delete record\n 4. display record\n------\nEnter your choice: ");

            s = sc.nextInt();
            switch (s) {
                case 1:
                    adressbook[i] = new AdressBook();
                    adressbook[i].serial_no = i+1;
                    adressbook[i].setName();
                    adressbook[i].setAdress();
                    i++;
                    break;

                case 2:
                    System.out.println("Enter the serial number: ");
                    no = sc.nextInt();
                    adressbook[no-1].updateRecord(adressbook[no-1]);
                    break;

                case 3:
                    System.out.println("Enter the serial number: ");
                    no = sc.nextInt();
                    adressbook[no-1].deleteRecord(adressbook[no-1]);
                    System.out.println("serial numner "+no+" info has been deleted.");
                    break;

                case 4:
                    System.out.println("Enter the serial number: ");
                    no = sc.nextInt();
                    adressbook[no-1].display();
                    break;

                default:
                    System.out.println("wrong input");
                    break;
            }

        }while(s != 0);

    }
}
