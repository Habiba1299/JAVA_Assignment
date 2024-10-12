import java.util.Scanner;

 class Salaried extends Employee{
     protected String month;

    Scanner sc = new Scanner(System.in);

    Salaried(){
        super();
    }

     public String getName() {
         return name;
     }

     public void setName() {

         System.out.print("Name: ");
         String name = sc.nextLine();
         this.name = name;
     }


    public void setSalary()
    {
        System.out.println("Salary: ");
        salary = sc.nextDouble();
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

     public void monthlySalary() {
          salary = salary;
         System.out.println(name+" get "+salary+" monthly");
     }


}