import java.util.ArrayList;
import java.io.*;


class ClassProductList extends ArrayList<Product> {

	ClassProductList() {
	}


	void InitializeFromFile() {
		try {
			BufferedReader file;
			String strProductName;
			file = new BufferedReader(new FileReader("ProductInfo.txt"));
			while ((strProductName = file.readLine()) != null) {
				Product theProduct;
				theProduct = new Product(strProductName);
				add(theProduct);
			}
		} catch (Exception ignored) {
        }
	}

}