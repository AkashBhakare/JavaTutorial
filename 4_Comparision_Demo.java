class ComparisonDemo {

    public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;
		boolean result;
		
        if(value1 == value2)
            System.out.println("value1 == value2");
			
        if(value1 != value2)
            System.out.println("value1 != value2");
		
        if(value1 > value2)
            System.out.println("value1 > value2");
		
	    if(value1 < value2)
            System.out.println("value1 < value2");
			
        if(value1 <= value2)
            System.out.println("value1 <= value2");
			
		result = (value1 == value2);
		System.out.println(value1+" == "+value2+ "  => "+result);
		
		result = (value1 != value2);
		System.out.println(value1+" != "+value2+ "  => "+result);
		
		result = (value1 > value2);
		System.out.println(value1+" > "+value2+ "  => "+result);
		
		result = (value1 < value2);
		System.out.println(value1+" < "+value2+ "  => "+result);
		
		result = (value1 <= value2);
		System.out.println(value1+" <= "+value2+ "  => "+result);
		
		
		
    }
}