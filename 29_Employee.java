
package com.impetusits;

/**
 *
 * @author Akash
 */
public class Employee {
    
    private String name ;
    private int empID;
    private float basicSalary;
    
    private boolean is_name_proper(String name) {
        if (name.isEmpty() || name.strip().length() == 0) {
            return false;
        }
        return true;
    }

    private boolean is_id_valid(int id) {
        return id > 0;
    }

    private boolean is_salary_valid(float salary) {
        return salary > 10000;
    }

    Employee(String name, int id, float salary) {
        if (is_name_proper(name)) {
            this.name = name.strip();
        } else {
            throw new RuntimeException("Invalid name supplied");
        }
        if (is_id_valid(id)) {
            empID = id;
        } else {
            throw new RuntimeException("Invalid Employee id!");
        }

        if (is_salary_valid(salary)) {
            basicSalary = salary;
        } else {
            throw new RuntimeException("Invalid Salary");
        }

    }

    /*Accessor (Getter) Methods*/
    public String getName() {
        return name;
    }

    public int getID() {
        return empID;
    }

    public float getSalary() {
        return basicSalary;
    }
    static
    {
        System.out.println("Class is loaded");
    }
    
}
