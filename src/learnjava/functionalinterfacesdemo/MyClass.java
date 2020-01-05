package learnjava.functionalinterfacesdemo;

public class MyClass {


	public static void main(String args[]){
		MyFunctionalInterface obj = () -> System.out.println("In abstractMethod");
		obj.abstractMethod();
	}

}
