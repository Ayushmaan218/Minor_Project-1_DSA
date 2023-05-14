import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();String[] date = new String[3];
        Employee[] e = new Employee[n];
        for (int i = 0; i < e.length; i++){
            System.out.println("Enter the name of employee " + (i+1) + ": ");
            String name = sc.next();
            System.out.println("Enter the ID of employee " + (i+1) + ": ");
            int id = sc.nextInt();
            System.out.println("Enter the salary of employee " + (i+1) + ": ");
            double salary = sc.nextDouble();
            System.out.println("Enter the hire date of employee " + (i+1) + " (dd-mm-yyyy): ");
            date[0] = sc.next();
            date[1] = sc.next();
            date[2] = sc.next();
            Date hireDate = new Date(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));
            System.out.println("Enter the job position of employee " + (i+1) + ": ");
            String jobPosition = sc.next();
            System.out.println("Enter the contact number of employee " + (i+1) + ": ");
            String contactNumber = sc.next();
            System.out.println("Enter the address of employee " + (i+1) + ": ");
            String street = sc.next();
            String state = sc.next();
            String country = sc.next();
            int zipCode = sc.nextInt();
            Address address = new Address(street, state, country, zipCode);
            e[i] = new Employee(name, id, salary, hireDate, jobPosition, contactNumber, address);
        }
        arrangeEmployeeBySalary(e);
        getEmployeesByJobPosition(e, "HR");
        getEmployeesByHireDate(e, new Date(1, 2, 2023), new Date(31, 3, 31));
        int foreignEmployees = foreignEmployeeCount(e);
        System.out.println("Number of foreign employees: " + foreignEmployees);
        getEmployeesBySalary(e, 150000, 300000);
        sc.close();
    }
    public static void arrangeEmployeeBySalary(Employee e[]){
        for(int i=0;i<e.length;i++){
            for(int j=i+1;j<e.length;j++){
                if(e[i].getSalary()<e[j].getSalary()){
                    Employee temp = e[i];
                    e[i] = e[j];
                    e[j] = temp;
                }
            }
        }
    }
    public static void getEmployeesByJobPosition(Employee e[], String jp){
        System.out.println("Employees whose job position is "+jp+":");
        for(Employee employee:e){
            if(employee.getjobPosition().equals(jp)){
                System.out.println(employee);
            }
        }
    }
    public static void getEmployeesByHireDate(Employee e[], Date d1, Date d2){
        System.out.println("Employees hired between "+d1+" and "+d2+":");
        for(Employee employee:e){
            if(employee.gethireDate().compareTo(d1) >= 0 && employee.gethireDate().compareTo(d2) <= 0){
                System.out.println(employee);
            }
        }
    }
    public static int foreignEmployeeCount(Employee e[]){
        int Count = 0;
        for(Employee employee:e){
            if(!employee.getcontactNumber().startsWith("+91")){
                Count++;
            }
        }
        return Count;
    }
    public static void getEmployeesBySalary(Employee e[], double s1, double s2){
        System.out.println("Employees with Salary in the range of "+s1+" INR to "+s2+" INR");
        for(Employee employee:e){
            if(employee.getSalary() >= s1 && employee.getSalary() <= s2){
                System.out.println(employee);
            }
        }
    }
}
