import java.util.Scanner;

public class HourlySalaried extends Employee{
    protected int hour;
    protected int day;

    Scanner sc = new Scanner(System.in);

    HourlySalaried(){
        super();
        this.hour = hour;
    }

    public String getName() {
        return name;
    }

    public void setName() {

        System.out.print("Name: ");
        String name = sc.nextLine();
        this.name = name;
    }

    public void setHour()
    {
        System.out.println("total hour in a day:");
        hour = sc.nextInt();
        this.hour = hour;
    }

    public int getHour()
    {
        return hour;
    }

    public void setDay()
    {
        System.out.println("total day in a month:");
        day= sc.nextInt();
        this.day = day;
    }

    public int getDay()
    {
        return day;
    }

    public void setSalary()
    {
        System.out.println("Hourly salary:");
        salary = sc.nextDouble();
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void  monthlySalary() {
        salary = salary*day*hour;
        salary = salary;
        System.out.println(name+" get "+salary+" monthly by hour based salary");
    }

}