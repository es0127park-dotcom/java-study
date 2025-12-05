package example01;

public class EmpApp {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        // 1-1. 더미로 사원을 10명 만든다. (생성자 유형을 다 써보기)
        Employee e1 = new Employee("홍길동","010-1111-1111");
        Employee e2 = new Employee("김철수","010-2222-2222");
        Employee e3 = new Employee("최미영","010-3333-3333");
        Employee e4 = new Employee("유재석","010-4444-4444","인사팀");
        Employee e5 = new Employee("이광수","010-5555-5555","영업팀");
        Employee e6 = new Employee("안유진","010-6666-6666","개발팀");
        Employee e7 = new Employee("장원영","010-7777-7777","경영팀",10001,2000000,"111-111-12345","사원");
        Employee e8 = new Employee("박정민","010-8888-8888","홍보팀",10002,3000000,"222-222-12345","대리");
        Employee e9 = new Employee("조세호","010-9999-9999","영업팀",10003,4000000,"333-333-12345","과장");
        Employee e10 = new Employee("홍진경","010-1234-5678","재무팀",10004,5000000,"444-444-12345","부장");

        // 1-2. 직원의 상태를 변경해준다. setter
        e1.setDept("개발팀");
        e1.setEmpNo(10005);
        e1.setSalary(2000000);
        e1.setAccount("555-555-12345");
        e1.setPosition("사원");
        e2.setDept("재무팀");
        e2.setEmpNo(10006);
        e2.setSalary(2000000);
        e2.setAccount("666-666-12345");
        e2.setPosition("사원");
        e3.setDept("홍보팀");
        e3.setEmpNo(10007);
        e3.setSalary(3000000);
        e3.setAccount("777-777-12345");
        e3.setPosition("대리");
        e4.setEmpNo(10008);
        e4.setSalary(4000000);
        e4.setAccount("888-888-12345");
        e4.setPosition("과장");
        e5.setEmpNo(10009);
        e5.setSalary(5000000);
        e5.setAccount("999-999-12345");
        e5.setPosition("부장");
        e6.setEmpNo(10010);
        e6.setSalary(2000000);
        e6.setAccount("123-456-12345");
        e6.setPosition("사원");
        
        // 2. 사원 10명을 employees에 담는다. (배열)
        employees[0]=e1;
        employees[1]=e2;
        employees[2]=e3;
        employees[3]=e4;
        employees[4]=e5;
        employees[5]=e6;
        employees[6]=e7;
        employees[7]=e8;
        employees[8]=e9;
        employees[9]=e10;

        // 3. printInfo 호출 (전체사원)
        for (int i = 0; i < 10; i++) {
            employees[i].printInfo();
        }

        // 4-1. 전체 직원의 월급의 합을 출력
        int totalMonthlySalary=0;
        for (int i = 0; i < 10; i++) {
            totalMonthlySalary = totalMonthlySalary + employees[i].getSalary();
        }
        System.out.println("이번 달 월급 총액 = " + totalMonthlySalary +"원");
        
        // 4-2. 전체 직원의 연봉의 합을 출력
        int totalYearSalary=0;
        for (int i = 0; i < 10; i++) {
            totalYearSalary = totalYearSalary + employees[i].getSalary()*12;
        }
        System.out.println("기본 연봉 총액 = " + totalYearSalary +"원");
        
        // 5. 전체 직원 연봉+보너스의 합 (10%, 20%, 30%, 40%)
        int totalYearSalaryWithBonus=0;
        for (int i = 0; i < 10; i++) {
            if (employees[i].getPosition().equals("사원")){
                totalYearSalaryWithBonus = (int) (totalYearSalaryWithBonus + employees[i].getSalary() * 12 * 1.1);
            }
            if (employees[i].getPosition().equals("대리")){
                totalYearSalaryWithBonus = (int) (totalYearSalaryWithBonus + employees[i].getSalary() * 12 * 1.2);
            }
            if (employees[i].getPosition().equals("과장")){
                totalYearSalaryWithBonus = (int) (totalYearSalaryWithBonus + employees[i].getSalary() * 12 * 1.3);
            }
            if (employees[i].getPosition().equals("부장")){
                totalYearSalaryWithBonus = (int) (totalYearSalaryWithBonus + employees[i].getSalary() * 12 * 1.4);
            }
        }
        System.out.println("보너스 포함 연봉 총액 = " + totalYearSalaryWithBonus +"원");

        // 7. 특정 사원 승진 시키기

        // 8. 월급 이체 시뮬레이션
        for (int i = 0; i < 10; i++) {
            System.out.println("[급여 이체 완료] " + employees[i].getName() + "님께 " + employees[i].getSalary() + "원이 " + employees[i].getAccount() + " 계좌로 지급되었습니다.");
        }
    }
}
