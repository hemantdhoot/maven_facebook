package basicprogram;

public class UpdatingGlobalVarValue {
	int age;
	double salary;
	String name;
void add(int age, double salary, String name) {
	System.out.println(age);
	System.out.println(salary);
	System.out.println(name);
}
	public static void main(String[] args) {
		UpdatingGlobalVarValue g1 = new UpdatingGlobalVarValue();
		g1.add(78, 567878, "hemant");
		
		System.out.println(g1.age);
		System.out.println(g1.salary);
		System.out.println(g1.name);
	}

}
