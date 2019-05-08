package learnjava.functionalinterfacesdemo;

import java.util.List;
import java.util.function.BiFunction;


public class BiFunctionDemo {

	public static void main(String[] args) {
		example3();
	}
	
	private static void example1(){
		BiFunction<Integer,Integer,Integer> multiplier = (a,b) -> {return a*b;};
		int input1 = 6;
		int input2 = 8;
		System.out.println("Result of multiplying "+input1+" and "+input2 +" is "+multiplier.apply(input1,input2) );
	}
	
	private static void example2(){
		String input = "hello,world";
		
		BiFunction<String,Character,String[]> stringSplitter = (inputStr,inputChar) -> {String[] list = inputStr.split(inputChar.toString()); return list;};
		String[] result = stringSplitter.apply(input, new Character(','));
		for(String str:result){
			System.out.println("String is "+str);
		}
	}
	
	private static void example3(){
		String input = "hello,world";
		
		BiFunction<String,Integer,Person> personCreator = (name,age) -> {return new Person(name,age);};
		Person person = personCreator.apply("Mickey Mouse",35);
		System.out.println("Person object created with name as "+person.getName());
	}

}
