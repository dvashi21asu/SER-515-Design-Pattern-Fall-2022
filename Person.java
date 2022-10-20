import java.util.*;
abstract public class Person {
	int type = 0; 
	String UserName;
	ClassProductList ProductList;
	ProductMenu theProductMenu;
	Product CurrentProduct;

	Person() {
		ProductList = new ProductList();
	}

	abstract public void CreateProductMenu(Product theProduct, int theCategory);

	void showAddButton() {
		theTradingMenu.ShowAddButtons();
	}

	void showViewButtons() {
		theTradingMenu.ShowViewButtons();
	}

	void showComboxes() {theProductMenu.ShowComboxes();	}

	void showRadios() {
		theProductMenu.ShowRadios();
	}

	void show() {
		theProductMenu.setVisible(true);
	}

	boolean ifLogout() {
		return theProductMenu.ifLogout();
	}

	public boolean ShowMenu() {
		Iterator theIter = CurrentProduct.tradingList.iterator();
		theProductMenu.theProduct = CurrentProduct;
		Trading theTrading;
		while (theIter.hasNext()) {
			theTrading = (Trading) theIter.next();
			theProductMenu.TradingCombox.addItem(theTrading);
		}
		return false;
	}

	ClassProductList GetProductList() {
		return ProductList;
	}

	void AddProduct(Product theProduct) {
		ProductList.add(theProduct);
	}
}