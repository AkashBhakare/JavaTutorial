package com.impetusits;

/**
 *
 * @author Akash
 */
public class TestEmployee {
    public static void main(String[] args) throws ClassNotFoundException{
        /* Defines a class type reference variable; which can point to any 
        object of type Employee   */
//        Class c_ref = TestEmployee.class;
//        ClassLoader loader_ref = c_ref.getClassLoader();
//        loader_ref.loadClass("Employee");
                
       // TestEmployee.class.getClassLoader().loadClass("in.impetus.Employee");
        
        Employee e1;
        e1 = new Employee("Mansi", 1, 20000.0F);
        System.out.println("The employee information is as follows:");
        System.out.println("Name        :" + e1.getName());
        System.out.println("Employee Id :" + e1.getID());
        System.out.println("Salary (Rs) :" + e1.getSalary());

//        in.keysolution.Hardware href= new in.keysolution.Hardware();
//        in.creative.Hardware h;
//        Software os;
//        System.err.println("This is a Error message");
//        System.gc();
//        in.creative.Hardware.gc();
//        gc();
    }
    
}
