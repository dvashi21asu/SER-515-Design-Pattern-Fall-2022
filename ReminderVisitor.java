import java.util.*;
public class ReminderVisitor extends NodeVisitor {

	private Reminder m_Reminder;

	ReminderVisitor(Reminder reminder) {
		m_Reminder = reminder;
	}

	public void visitFacade(Facade facade) {
		ProductIterator productList = new ProductIterator(facade.theProductList);
		while (productList.hasNext()) {
			Product product = (Product) productList.next();
			product.accept(this);
		}
	}

	public void visitProduct(Product product) {
		for (Trading trading : product.tradingList) {
			trading.accept(this);
		}
	}

	public void visitTrading(Trading trading) {
		Date today = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(today);
		int ntoday = calendar.get(Calendar.DAY_OF_YEAR);
		calendar.setTime(assignment.DueDate);
		int nDueDate = calendar.get(Calendar.DAY_OF_YEAR);
		if (nDueDate <= (ntoday + 1) && nDueDate >= ntoday) 
		{
			m_Reminder.listUpcoming.add("today is " + today.toString() + " " + trading.TradName + " Due Date is "
					+ trading.getDueDateString());
		}
		if (nDueDate < ntoday) {
			m_Reminder.listOverdue.add(trading.TradName + " Due Date is " + trading.getDueDateString());
		}

	}

}