import java.util.ArrayList;
import java.util.List;

public class Menu extends ComposantDeMenu {

	List<ComposantDeMenu> composantDeMenus = new ArrayList<>();

	public Menu(String nom) {
		super(nom);
	}

	@Override
	public void afficher() {
		String tab = indentation();
		System.out.println(tab + nom);
		composantDeMenus.stream().forEach(a -> {
			a.afficher();
		});
	}

	public void AddComposentMenu(ComposantDeMenu deMenu) {
		deMenu.niveau = this.niveau + 1;
		composantDeMenus.add(deMenu);
	}

	public void RemoveComposentMenu(ComposantDeMenu deMenu) {
		deMenu.niveau = this.niveau - 1;
		composantDeMenus.remove(deMenu);
	}

}
