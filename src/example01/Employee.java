package example01;

public class Employee {
    // 1. 상태만들기 + getter, setter
    private String name;
    private String phone;
    private String dept;
    private int empNo;
    private int salary;
    private String account;
    private String position;

    // 2. 생성자 만들기
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

    // 3. 메서드 만들기
    public void printInfo(){
        System.out.println(name + " / " + phone + " / " + dept + " / 사원번호: " + empNo + " / 직급: " + position + " / 월급: " + salary + " / 계좌: " + account);
    }

    public int calcYearSalary(){
        return salary*12;
    }

    // 1. setter, getter
    public void setName(String name){
        this.name = name;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public void setDept(String dept){
        this.dept = dept;
    }
    public void setEmpNo(int empNo){
        this.empNo = empNo;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public void setAccount(String account){
        this.account = account;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public String getName(){
        return name;
    }
    public String getPhone(){
        return phone;
    }
    public String getDept(){
        return dept;
    }
    public int getEmpNo(){
        return empNo;
    }
    public int getSalary(){
        return salary;
    }
    public String getAccount(){
        return account;
    }
    public String getPosition(){
        return position;
    }
}
