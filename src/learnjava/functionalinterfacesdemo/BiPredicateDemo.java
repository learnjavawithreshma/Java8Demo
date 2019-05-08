package learnjava.functionalinterfacesdemo;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
	public static void main(String[] args) {
		BiPredicate<String,Integer> checkStringLength = (str,length) -> {return (str.length() > length) ;};						
																        
		System.out.println("Hello World has length greater than 5 = "+checkStringLength.test("Hello World",5));
		System.out.println("Hello World has length greater than 12 = "+checkStringLength.test("Hello World",12));

	}
	

	//public static void main(String[] args) {
//		BiPredicate<String,String> isSubString = (str1,str2) -> {return (str1.indexOf(str2)>0 || str1.startsWith(str2));};
//		System.out.println("Hello World has substring as Hello = "+isSubString.test("Hello World","Hello"));
//		System.out.println("Hello World has substring as Test = "+isSubString.test("Hello World","Test"));
	//
	//}
}



