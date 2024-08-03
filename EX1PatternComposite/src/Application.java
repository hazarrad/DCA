
public class Application {

	public static void main(String[] args) {

		// example 1
		fichiers root = new fichiers("fichier DCA");
		fichiers F1 = new fichiers("JAVA");
		fichiers F2 = new fichiers("SPRING");
		fichiers F3 = new fichiers("UML");
		// spring
		SubFolder s1 = new SubFolder("SPRING BOOT");
		SubFolder s2 = new SubFolder("SPRING DATA");
		SubFolder s3 = new SubFolder("SPRING SECURITY");
		// JAVA
		SubFolder s4 = new SubFolder("INTRODUCTION TO JAVA");
		SubFolder s5 = new SubFolder("Object Oriented Programming");
		SubFolder s6 = new SubFolder("JAVA API's");
		// UML
		SubFolder s7 = new SubFolder("Diagramme de cas d'utilisation");
		SubFolder s8 = new SubFolder("Diagramme de classe");
		SubFolder s9 = new SubFolder("Diagramme de séquences");

		raccourci r1 = new raccourci("JAVA raccourci");
		raccourci r2 = new raccourci("SPRING raccourci");

		root.AddComposentMenu(F1);
		root.AddComposentMenu(F2);
		root.AddComposentMenu(F3);

		F1.AddComposentMenu(s4);
		F1.AddComposentMenu(s5);
		F1.AddComposentMenu(s6);
		F1.AddComposentMenu(r1);

		F2.AddComposentMenu(s1);
		F2.AddComposentMenu(s2);
		F2.AddComposentMenu(s3);
		F2.AddComposentMenu(r2);

		F3.AddComposentMenu(s7);
		F3.AddComposentMenu(s8);
		F3.AddComposentMenu(s9);

		root.afficher();

	}
}
