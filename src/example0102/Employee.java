package example0102;

public class Employee {
    // 1-1. 필드 정의
    private String name;
    private String phone;
    private String dept;
    private int empNo;
    private int salary;
    private String account;
    private String position;

    // 1-2. 생성자 오버로딩
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

    // 1-3. 메서드 정의
    // (1) 사원 정보 출력 메서드
    void printInfo(){
        System.out.println(name + " / " + phone  + " / " + dept + " / 사원번호 : " + empNo + " / 직급 : " + position + " / 월급 : " + salary + " / 계좌 : " + account);
    }

    // (3) 연봉 계산 메서드 (기본) -> 이게 맞는건지..? 확인 필요
    int calcYearSalary(){
        return getSalary() * 12;
    }

    // (4) 연봉+직급별 보너스를 포함한 연봉 (심화) -> 이게 맞는건지..? 확인 필요
    int calcYearSalaryWithBonus(){
        if (getPosition().equals("사원")) {
            return (int) (getSalary() * 12 * 1.1);
        } else if (getPosition().equals("대리")) {
            return (int) (getSalary() * 12 * 1.2);
        } else if (getPosition().equals("과장")) {
            return (int) (getSalary() * 12 * 1.3);
        } else if (getPosition().equals("부장")) {
            return (int) (getSalary() * 12 * 1.4);
        }
        return 0;
    }

    // (5) 승진 메서드 (심화)
    void promote(){
        if (getPosition().equals("사원")){
            setPosition("대리");
            setSalary(300);
        } else if (getPosition().equals("대리")){
            setPosition("과장");
            setSalary(400);
        } else if (getPosition().equals("과장")){
            setPosition("부장");
            setSalary(500);
        }
    }

    // (2) 사원 정보 수정용 메서드 (Setter/Getter)
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
