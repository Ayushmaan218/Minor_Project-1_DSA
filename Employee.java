public class Employee{
    private String name;
    private int empId;
    private double salary;
    private Date hireDate;
    private String jobPosition;
    private String contactNumber;
    private Address address;
    public Employee(String name, int empId, double salary, Date hireDate2, String jobPosition, String contactNumber, Address address){
        this.name = name;
        this.empId = empId;
        this.salary = salary;
        this.hireDate = hireDate2;
        this.jobPosition = jobPosition;
        this.contactNumber = contactNumber;
        this.address = address;
    }
    public Employee(String name2, int id, double salary2, java.util.Date hireDate2, String jobPosition2,
            String contactNumber2, Address address2) {
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
    public String getDetails() {
        return "Name: " + name + ", Employee ID: " + empId + ", Salary: " + salary + ", Hire Date: " +
                hireDate.toString() + ", Job Position: " + jobPosition + ", Contact Number: " +
                contactNumber + ", Address: " + address.toString();
    }
}
