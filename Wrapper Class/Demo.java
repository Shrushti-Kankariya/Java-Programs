
public class Demo {
	//int 		Integer
	//char		Character
	//float		Float
	//boolean 	Boolean
	
	public static void main(String[] args) {
		int no = 25;		//primitive
		Integer i1 = no;	//Object
		
		//Conversion from primitive data type to object is called AutoBoxing
		
		Float f1 = 45.54f;		//object
		float n2 = f1;			//primitive
		
		//Conversion from object to primitive is called as AutoUnboxing
		
		
		String n = "2435";
		
		//Conversion of String to primitive -> parser
		int n3 = Integer.parseInt(n);
		
		//conversion of String to Wrapper class -> ValueOf
		Integer i3 = Integer.valueOf(n);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Short.SIZE);
		
		//comparing two number without if else condition
		
		System.out.println(Integer.max(345,6746));
		
		System.out.println(Character.SIZE);
		
	}
}
