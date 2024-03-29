package com.impetusits;

/**
 *
 * @author Akash
 */
public class Employee {

    private int empId;
    private String name;

    public Employee(int empId, String name) {
        this.name = name;
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" + " empId = " + empId + ", name = " + name + '}';
    }
    
}
