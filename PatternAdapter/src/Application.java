
public class Application {

	public static void main(String[] args) {

		Employee employee = new Employee();

		System.out.println("**************************Start****************************");
		employee.setUtilisateur(new GrandDistribution("Hamza"));
		employee.afficher();
		System.out.println("*******************************");
		EmployeeAdapter employeeAdapter = new EmployeeAdapter("Hassan","software developer");
		employee.setUtilisateur(employeeAdapter);
		employee.afficher();
		System.out.println("****************************End*****************************");


	}
}
