package learnjava.functionalinterfacesdemo;

import java.util.function.BinaryOperator;

public class BinaryOperatorStringDemo {

	public static void main(String[] args) {
		BinaryOperator<String> strOperator = (str1,str2) -> str1.concat(" ").concat(str2);
		String str1 = "Hello";
		String str2 = "World";
		System.out.println("Concatenated String:" + strOperator.apply(str1, str2));
	

	}

}
