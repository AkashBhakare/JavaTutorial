package com.impetusits;

/**
 *
 * @author Akash
 */
public class TestEmployee {

    public static void main(String[] args) {
        /* Defines a class type reference variable; which can point to any 
        object of type Employee   */
        Employee e1;
        e1 = new Employee("Mansi", 1, 200.0F);
        System.out.println("Name        :" + e1.getName());
        System.out.println("Employee Id :" + e1.getID());
        System.out.println("Salary      :" + e1.getSalary());

        //Employee e2 = new Employee();
    }

}
