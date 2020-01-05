package learnjava.functionalinterfacesdemo;

@FunctionalInterface
public interface MyFunctionalInterface {
	
	public void abstractMethod();

	public default void defaultMethod(){
		System.out.println("Default method");
	}
	
	public default void staticMethod(){
		System.out.println("Static method");
	} 
}
