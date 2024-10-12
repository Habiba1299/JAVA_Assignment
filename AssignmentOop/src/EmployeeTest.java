public class EmployeeTest {

    public static void main(String[] args) {

        Employee [] employees= new Employee[4];

        employees[0] = new Salaried();
        employees[1] = new HourlySalaried();
        employees[2] = new Comissioned();


        ((Salaried)employees[0]).setName();
        ((Salaried)employees[0]).setSalary();
        ((Salaried)employees[0]).monthlySalary();


        ((HourlySalaried)employees[1]).setName();
        ((HourlySalaried)employees[1]).setSalary();
        ((HourlySalaried)employees[1]).setDay();
        ((HourlySalaried)employees[1]).setHour();
        ((HourlySalaried)employees[1]).monthlySalary();


        ((Comissioned)employees[2]).setName();
        ((Comissioned)employees[2]).setSalary();
        ((Comissioned)employees[2]).setProducts();
        ((Comissioned)employees[2]).monthlySalary();

    }
}
