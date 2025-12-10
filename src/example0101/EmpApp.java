package example0101;

public class EmpApp {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        Employee e1 = new Employee("홍길동","010-1111-1111");
        Employee e2 = new Employee("장보고","010-2222-2222","인사팀");
        Employee e3 = new Employee("임꺽정","010-3333-3333","개발팀",10001,200,"111-111-11111","사원");
        Employee e4 = new Employee("강호동","010-4444-4444","재무팀",10002,200,"222-222-22222","사원");
        Employee e5 = new Employee("유재석","010-5555-5555","영업팀",10003,200,"333-333-33333","사원");
        Employee e6 = new Employee("이수근","010-6666-6666","홍보팀",10004,200,"444-444-44444","사원");
        Employee e7 = new Employee("은지원","010-7777-7777","인사팀",10005,200,"555-555-55555","사원");
        Employee e8 = new Employee("조규현","010-8888-8888","개발팀",10006,300,"666-666-66666","대리");
        Employee e9 = new Employee("이영지","010-9999-9999","재무팀",10007,400,"777-777-77777","과장");
        Employee e10 = new Employee("안유진","010-0000-0000","영업팀",10008,500,"888-888-88888","부장");

        employees[0] = e1;
        employees[1] = e2;
        employees[2] = e3;
        employees[3] = e4;
        employees[4] = e5;
        employees[5] = e6;
        employees[6] = e7;
        employees[7] = e8;
        employees[8] = e9;
        employees[9] = e10;

        e1.setDept("홍보팀");
        e1.setEmpNo(10009);
        e1.setSalary(200);
        e1.setAccount("999-999-99999");
        e1.setPosition("사원");
        e2.setEmpNo(10010);
        e2.setSalary(200);
        e2.setAccount("123-123-12345");
        e2.setPosition("사원");

        for (int i = 0; i < employees.length; i++) {
            employees[i].printInfo();
        }

        int totalMonthlySalary = 0;
        for (int i = 0; i < employees.length; i++) {
            totalMonthlySalary = totalMonthlySalary + employees[i].getSalary();
        }
        System.out.println("전체 사원의 월급의 총액 = " + totalMonthlySalary + "원");

        int totalYearSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            totalYearSalary = totalYearSalary + employees[i].getSalary() * 12;
        }
        System.out.println("전체 사원의 연봉의 총액 = " + totalYearSalary + "원");

        int totalYearSalaryWithBonus=0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getPosition().equals("사원")){
                totalYearSalaryWithBonus = totalYearSalaryWithBonus + (int) (employees[i].getSalary() * 12 * 1.1);
            } else if (employees[i].getPosition().equals("대리")){
                totalYearSalaryWithBonus = totalYearSalaryWithBonus + (int) (employees[i].getSalary() * 12 * 1.2);
            } else if (employees[i].getPosition().equals("과장")){
                totalYearSalaryWithBonus = totalYearSalaryWithBonus + (int) (employees[i].getSalary() * 12 * 1.3);
            } else if (employees[i].getPosition().equals("부장")){
                totalYearSalaryWithBonus = totalYearSalaryWithBonus + (int) (employees[i].getSalary() * 12 * 1.4);
            }
        }
        System.out.println("전체 사원의 보너스 포함 연봉의 총액 = " + totalYearSalaryWithBonus + "원");

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().equals("홍길동")){
                if (employees[i].getPosition().equals("사원")) {
                    employees[i].setPosition("대리");
                    employees[i].setSalary(300);
                } else if (employees[i].getPosition().equals("대리")) {
                    employees[i].setPosition("과장");
                    employees[i].setSalary(400);
                } else if (employees[i].getPosition().equals("과장")) {
                    employees[i].setPosition("부장");
                    employees[i].setSalary(500);
                }
            }
        }
        e1.printInfo();

        for (Employee n : employees){
            System.out.println("[급여 이체 완료] " + n.getName() + "님께 " + n.getSalary() + "원이 " + n.getAccount() + " 계좌로 지급되었습니다.");
        }
    }
}
