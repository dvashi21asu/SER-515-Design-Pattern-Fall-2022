Compilation Steps:
- Extract zip to a specific location
- Go to files->open project
- Give path to the extracted zip to open the project
- Right click on the project & clean and build
- Right click on the project and click run (here, assignDP.dvashi1 file contains main function, so if you're using another IDE, compile and run this file)

Description: 
In this assignment I implemented all 5 asked design patterns in the below described manner.
1. Facade: The facade pattern can make the task of accessing a large number of modules much simpler by providing an additional interface layer. The factory design pattern is implemented in the manner that, interface FacadeHandler contains several methods which are implemented in the class Facade. The class Facade has subsystem classes Login, Reminder, ProductMenu, TradingMenu and OfferingMenu. All of them works as mentioned in the questionnaire. 

2. Bridge: The Bridge pattern handles the load menu options. Here, I have created two abstract classes Person and ProductMenu. Both of them work on bridge pattern principles. Class Person has two subclasses Buyer, Seller. When buyer logs in, it shows buyer category access options and when seller logs in, it shows seller category access options. Same goes with MeatProductCategory and ProduceProductCategory. 

3. Factory Method: The Factory Method pattern enables the sub classes to decide which class to instantiate. Here, an abstract class Factory is created which is having a method getProductMenu. When it is called with two parameters userType and productcategory, it determine which class is to be implemented here.

4. Iterator: The Iterator pattern helps for accessing the list’s elements without exposing its internal structure. Here ArrayList, an abstract class is created for using a list. The class has two sub classes OfferingList and ClassProductList that uses this list. An abstract class ListIterator is implemented to iterate through all elements of the list that is used by two subclasses OfferingIterator and ProductIterator.

5. Visitor: Visitor Pattern encapsulates an operation that are performed on the elements of data structures. Here, an abstract class NodeVisitor is created that are having methods to visit Facade, trading and product elements. ReminderVisitor class uses this class to implement trading reminder functionality. An interface Reminder is created that is used by accept method of the classes ClassProductList and Trading. 
