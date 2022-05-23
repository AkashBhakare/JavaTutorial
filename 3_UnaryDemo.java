class UnaryDemo {
 
    public static void main(String[] args) {
 
        int num = +1;
        // num is now 1
        System.out.println(num);
 
        num--;
        // num is now 0
        System.out.println(num);
 
        num++;
        // num is now 1
        System.out.println(num);
 
      
        // num is now -1
        System.out.println(-num);
		System.out.println(num);
		
		 
        num = -num;
        // num is now -1
        System.out.println(num);
 
        boolean success = false;
        // false
        System.out.println(success);
        // true
        System.out.println(!success);
    }
}