import java.util.*;
import java.text.DateFormat;
public class Trading {

  String PdtName;
  Date DueDate=new Date();
  OfferingList theOfferingList=new OfferingList();
  Offering SuggestOffering=new Offering();



  public Trading() {
  }

  
  void AddOffering(Offering theOffering)
  {
    theOfferingList.add(theOffering);
  }

  OfferingIterator GetOfferingIterator()
  {
    return new OfferingIterator(theOfferingList);
  }

  public String toString()
  {
    return TradName;
  }

  String getDueDateString()
  {
    DateFormat dateFormat=DateFormat.getDateInstance(DateFormat.SHORT);
    return  dateFormat.format(DueDate);
  }

  void accept(NodeVisitor visitor)
  {
    visitor.visitTrading(this);
  }
}