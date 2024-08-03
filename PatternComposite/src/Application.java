
public class Application {

	public static void main(String[] args) {

		
		//example 1
		Menu root = new Menu("Restaurant DCA");
		Menu M1 = new Menu("PIZZA");
		Menu M2 = new Menu("SHAWARMA");
		Menu M3 = new Menu("SANDWISH");
		Menu M4 = new Menu("NORMAL");
		Menu M5 = new Menu("SPECIAL");

		Plat p1 = new Plat("PIZZA Poulet", 20);
		Plat p2 = new Plat("PIZZA 4 Fromage", 25);
		Plat p3 = new Plat("PIZZA Fuits de mer", 35);
		Plat p4 = new Plat("SHAWARMA Poulet", 20);
		Plat p5 = new Plat("SHAWARMA Viante", 25);
		Plat p6 = new Plat("SHAWARMA Mixte", 30);
		Plat p7 = new Plat("SANDWISH Poulet", 25);
		Plat p8 = new Plat("SANDWISH Viante", 30);
		Plat p9 = new Plat("SANDWISH Mixte", 35);
		Plat p10 = new Plat("SANDWISH Poulet", 30);
		Plat p11 = new Plat("SANDWISH Viante", 35);
		Plat p12 = new Plat("SANDWISH Mixte", 40);

		root.AddComposentMenu(M1);
		root.AddComposentMenu(M2);
		root.AddComposentMenu(M3);

		M3.AddComposentMenu(M4);
		M3.AddComposentMenu(M5);

		M1.AddComposentMenu(p1);
		M1.AddComposentMenu(p2);
		M1.AddComposentMenu(p3);

		M2.AddComposentMenu(p4);
		M2.AddComposentMenu(p5);
		M2.AddComposentMenu(p6);

		M4.AddComposentMenu(p7);
		M4.AddComposentMenu(p8);
		M4.AddComposentMenu(p9);

		M5.AddComposentMenu(p10);
		M5.AddComposentMenu(p11);
		M5.AddComposentMenu(p12);

		root.afficher();

	}
}
