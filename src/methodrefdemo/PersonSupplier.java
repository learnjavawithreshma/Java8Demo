package methodrefdemo;

@FunctionalInterface
public interface PersonSupplier {
	public Person createPerson(String name,int age);
}
