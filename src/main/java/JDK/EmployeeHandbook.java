package JDK;

import java.util.ArrayList;
import java.util.List;

public class EmployeeHandbook {
    private static List<Employee> employeeHandbookList;

    public EmployeeHandbook() {
        employeeHandbookList = new ArrayList<>();
    }

    public void findEmployeeByExperience(int experience){
        employeeHandbookList.stream().filter(e -> e.getExperience() == experience).forEach(System.out::println);
    }

    public void findEmployeeByPhoneNum(String phoneNum){
        employeeHandbookList.stream().filter(e -> e.getPhoneNum().equals(phoneNum)).forEach(System.out::println);
    }

    public void findEmployeeByTabNum(int tabNum){
        employeeHandbookList.stream().filter(e -> e.getTabNum() == tabNum).forEach(System.out::println);

    }

    public static void addEmployeeToHandbook(Employee employee){
        employeeHandbookList.add(employee);
    }
}
