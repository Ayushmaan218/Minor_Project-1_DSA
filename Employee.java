public class Employee{
    private String name;
    private int empId;
    private double salary;
    private Date hireDate;
    private String jobPosition;
    private String contactNumber;
    private Address address;
    public Employee(String name, int empId, double salary, Date hireDate, String jobPosition, String contactNumber, Address address){
        this.name = name;
        this.empId = empId;
        this.salary = salary;
        this.hireDate = hireDate;
        this.jobPosition = jobPosition;
        this.contactNumber = contactNumber;
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public int getempId(){
        return empId;
    }
    public double getSalary(){
        return salary;
    }
    public Date gethireDate(){
        return hireDate;
    }
    public String getjobPosition(){
        return jobPosition;
    }
    public String getcontactNumber(){
        return contactNumber;
    }
    public Address getaddress(){
        return address;
    }
}
    