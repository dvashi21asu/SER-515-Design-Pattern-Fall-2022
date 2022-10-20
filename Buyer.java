
public class Buyer extends Person {

	Buyer() {
		type = 0;
	}

	public void CreateProductMenu(Product theProduct, int theCategory) {

		if (theCategory == 0) {
			theProductMenu = new MeatProductMenu();
		} else {
			theProductMenu = new ProduceProductMenu();
		}
	}

	@Override
	public boolean ShowMenu() {
		super.ShowMenu();
		showViewButtons();
		showComboxes();
		showRadios();
		show();
		return ifLogout();
	}
}