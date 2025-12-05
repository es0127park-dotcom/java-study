package example0101;

public class Employee {
    private String name;
    private String phone;
    private String dept;
    private int empNo;
    private int salary;
    private String account;
    private String position;

    Employee(String name, String phone){
        this.name = name;
        this.phone = phone;
        dept = "미정";
        empNo = 0;
        salary = 0;
        account = "";
        position = "사원";
    }

    Employee(String name, String phone, String dept){
        this.name = name;
        this.phone = phone;
        this.dept = dept;
        empNo = 0;
        salary = 0;
        account = "";
        position = "사원";
    }

    Employee(String name, String phone, String dept, int empNo, int salary, String account, String position){
        this.name = name;
        this.phone = phone;
        this.dept = dept;
        this.empNo = empNo;
        this.salary = salary;
        this.account = account;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
