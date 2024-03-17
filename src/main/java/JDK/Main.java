package JDK;

public class Main {
    public static void main(String[] args) {
        EmployeeHandbook employeeHandbook = new EmployeeHandbook();
        Employee employee = new Employee(1, "12344", "Иванович", 11,employeeHandbook);
        Employee employee2 = new Employee(3, "2", "Иванович2", 22,employeeHandbook);
        Employee employee3 = new Employee(4, "3", "Иванович3", 33,employeeHandbook);
        Employee employee4 = new Employee(2, "4", "Иванович4", 44,employeeHandbook);
        Employee employee5 = new Employee(5, "5", "Иванович5", 55,employeeHandbook);
        Employee employee6 = new Employee(8, "6", "Иванович6", 66,employeeHandbook);
        Employee employee7 = new Employee(12, "7", "Иванович7", 77,employeeHandbook);
        employeeHandbook.findEmployeeByTabNum(3);
        employeeHandbook.findEmployeeByExperience(44);
        employeeHandbook.findEmployeeByPhoneNum("6");
        employeeHandbook.addEmployeeToHandbook(new Employee(10, "10", "Иванович10", 1,employeeHandbook));
        employeeHandbook.findEmployeeByTabNum(10);
//        employeeHandbook.findEmployeeByExperience(1);
//        employeeHandbook.findEmployeeByPhoneNum("10");
    }
}