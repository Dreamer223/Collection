package JDK;

public class Main {
    public static void main(String[] args) {
        EmployeeHandbook employeeHandbook = new EmployeeHandbook();
        Employee employee = new Employee(1, "12344", "Иванович", 11);
        Employee employee2 = new Employee(3, "2", "Иванович2", 22);
        Employee employee3 = new Employee(4, "3", "Иванович3", 33);
        Employee employee4 = new Employee(2, "4", "Иванович4", 44);
        Employee employee5 = new Employee(5, "5", "Иванович5", 55);
        Employee employee6 = new Employee(8, "6", "Иванович6", 66);
        Employee employee7 = new Employee(12, "7", "Иванович7", 77);
        employeeHandbook.findEmployeeByTabNum(3);
        employeeHandbook.findEmployeeByExperience(44);
        employeeHandbook.findEmployeeByPhoneNum("6");

    }
}