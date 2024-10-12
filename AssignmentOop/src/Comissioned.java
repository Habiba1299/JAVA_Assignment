import java.util.Scanner;

class Comissioned extends Employee{

    protected int products;

    Scanner sc = new Scanner(System.in);

    Comissioned(){
        super();
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName() {

        System.out.print("Name: ");
        String name = sc.nextLine();
        this.name = name;
    }

    public void setProducts()
    {
        System.out.println("total products in a month:");
        products = sc.nextInt();
        this.products = products;
    }

    public int getProducts()
    {
        return products;
    }

    public void setSalary()
    {
        System.out.println("comissioned salary:");
        salary = sc.nextDouble();
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void monthlySalary() {

        salary = salary*products;

        salary = salary;
        System.out.println(name+" get "+salary+" monthly by comissioned based salary");
    }
}
