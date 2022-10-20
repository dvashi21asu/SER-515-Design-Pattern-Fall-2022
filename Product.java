import java.util.*;
public class Product {
  private String ProductName;
  ArrayList<Trading> tradingList= new ArrayList<>();


  public Product(String strProduct) {
    this.ProductName = strProduct;

   
  }
  
  void AddTrading(Trading newTrad)
  {
    tradingList.add(newTrad);
  }
  
  public String toString()
  {
    return ProductName;
  }
  
  void accept(NodeVisitor visitor)
  {
    visitor.visitProduct(this);
  }

}