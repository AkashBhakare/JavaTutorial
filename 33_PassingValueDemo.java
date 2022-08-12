package com.impetusits;

/**
 *
 * @author Akash
 */
public class PassingValueDemo {
    
    public static void main(String[] args) {
        //primitive_type_assignment(); 
        // passingPrimitiveType();
        passingClassType();
    }

    private static void primitive_type_assignment() {
        int x = 10;
        int y = x;
        System.out.println("X : " + x + "\tY : " + y);
        x = 88;
        System.out.println("X : " + x + "\tY : " + y);
    }

    public static void passingPrimitiveType() {
        int val = 10;
        System.out.println("Val(passingPrimitiveType) = " + val);
        passPrimitive(val);
        System.out.println("Val(passingPrimitiveType) = " + val);

    }

    private static void passPrimitive(int val) {
        System.out.println("Val(passPrimitive)" + val);
        val++;
        System.out.println("Val(passPrimitive)" + val);

    }

    public static void passingClassType() {
        Employee emp = new Employee(1, "Ramesh");
  //    System.out.println("Calling Routine : " + emp.toString());
        System.out.println("Calling Routine : " + emp);
        passClassType(emp);
        System.out.println("Calling Routine : " + emp);

    }

    private static void passClassType(Employee emp) {
        System.out.println("Called Routine : " + emp);
        emp.setEmpId(2);
        System.out.println("Called Routine : " + emp);
//        emp = new Employee(55, "Raja");
       emp = null;
        System.out.println("Called Routine : " + emp);
    }
    
}
