public class Test {
    public static void main(String[] args) {
        Employee[] e = new Employee[500];
        for (int i = 0; i < e.length; i++){
            e[i] = new Employee("Employee " + (i+1), i+1, 100000 + (i*100), new Date(2022, 1, 1), "Developer", "+91-1234567890", new Address("123 Main St", "City", "State", "Country", 12345));
        }
        arrangeEmployeeBySalary(e);
        getEmployeesByJobPosition(e, "Manager");
        getEmployeesByHireDate(e, new Date(2022, 4, 1), new Date(2023, 3, 31));
        int foreignEmployees = foreignEmployeeCount(e);
        System.out.println("Number of foreign employees: " + foreignEmployees);
        getEmployeesBySalary(e, 150000, 300000);
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
