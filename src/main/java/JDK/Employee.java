package JDK;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int tabNum;
    private String phoneNum;
    private String name;
    private int experience;
    EmployeeHandbook employeeHandbook = new EmployeeHandbook();

    public Employee(int tabNum, String phoneNum, String name, int experience, EmployeeHandbook employeeHandbook) {
        this.tabNum = tabNum;
        this.phoneNum = phoneNum;
        this.name = name;
        this.experience = experience;
        this.employeeHandbook = employeeHandbook;
        employeeHandbook.addEmployeeToHandbook(this);


    }

    public int getTabNum() {
        return tabNum;
    }

    public void setTabNum(int tabNum) {
        this.tabNum = tabNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "tabNum=" + tabNum +
                ", phoneNum='" + phoneNum + '\'' +
                ", name='" + name + '\'' +
                ", experience=" + experience +
                '}';
    }
}
